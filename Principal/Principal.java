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
            System.out.println("    1 - Insert atributes in database         ");
            System.out.println("    2 - Take out atributes and insert on list of object");
            System.out.println("    3 - Search the Ghost through the id      ");
            System.out.println("    4 - Delete a value of an attribute in the database");
            System.out.println("    5 - Print the Ghosts in the list         ");
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
                    SearchDB();
                    break;

                case 4:
                    deleteGhostDB();
                    break;

                case 5:
                    orderDB();
                    break;

            }

        }

    }

    private static void orderDB() {

        System.out.println("Write the atribute of the Ghost that you want to order the DB: ");
        System.out.print("      Atribute: ");
        String column = Receba.LerString();

        GhostsDAO.OrderDB(column);
        
    }

    private static void deleteGhostDB() {
        
        System.out.println("Write the atribute and the value of it to delete the Ghost that you want: ");
        System.out.print("      Atribute: ");
        String column = Receba.LerString();
        System.out.print("      Value: ");
        int value = Receba.LerNumero();

        GhostsDAO.DeleteDB(column, value);

    }

    private static void SearchDB() {

        System.out.println("Write the atribute and the value of it to search the Ghost that you want: ");
        System.out.print("      Atribute: ");
        String column = Receba.LerString();
        System.out.print("      Value: ");
        int value = Receba.LerNumero();

        Ghost phantom = GhostsDAO.SearchBD(column, value);

        System.out.println();
        System.out.println("    BOOOOOOO!!    ");

        phantom.PrintGhostWithID();

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