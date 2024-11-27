package Principal;

import java.util.ArrayList;

import DAO.GhostsDAO;
import Models.Ghost;
import lib.Receba;

public class Principal {

    public static void main(String[] args) {
        int menu;
        GhostsDAO phantomDAO = new GhostsDAO();

        while (true) {
            System.out.println("=============================================");
            System.out.println("           MENU OF ITERATION                 ");
            System.out.println("=============================================");
            System.out.println("    0 - Exit                                 ");
            System.out.println("    1 - Insert atributes in BD               ");
            System.out.println("    2 - Take out atributes and insert on list of object");
            System.out.println("    3 - Print the Ghosts in the list         ");
            System.out.println("=============================================");
            System.out.print("Choose an option: ");
            System.out.println();

            menu = Receba.LerNumero();
            System.out.println();

            if (menu == 0) {
                break;
            }

            switch (menu) {
                case 1:
                    insertBD(phantomDAO);
                    break;

                case 2:
                    takeOutAndInsertList();
                    break;

                case 3:
                    SearchWithID();
                    break;

            }

        }

    }

    private static void SearchWithID() {
        
        System.out.println("Write the id of the Ghost that you want search: ");
        int num = Receba.LerNumero();

        Ghost phantom = GhostsDAO.SearchBD(num);

        System.out.println("This is the Ghost: ");
        phantom.PrintGhost();

    }

    private static void takeOutAndInsertList() {
        ArrayList<Ghost> listPhantom = new ArrayList<>();

        GhostsDAO.TakeOutGhostsBD(listPhantom);

        for (Ghost ph : listPhantom) {
            ph.PrintGhostWithID();
        }

    }

    private static GhostsDAO insertBD(GhostsDAO phantomDAO) {

        Ghost phantom = new Ghost();

        System.out.println("How many Ghost do you want to insert? ");

        int x = Receba.LerNumero();
        System.out.println();

        if (x == 1) {
            System.out.println("Write the name of the Ghost, the Strenght, and the size ");
        } else {
            System.out.println("Write the name of the Ghosts, the Strenghts, and the sizes of the them: ");
        }

        for (int i = 0; i < x; i++) {

            phantom.ReadGhostUser();
            phantomDAO.InsertGhostBD(phantom);

        }

        return phantomDAO;

    }

}