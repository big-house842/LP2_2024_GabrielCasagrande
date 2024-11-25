package Principal;

import DAO.GhostsDAO;
import Modelos.Ghost;

public class Principal {

    public static void main(String[] args) {

        Ghost phantom = new Ghost();
        phantom.ReadGhost("Little Gaspa", 812, 105);

        GhostsDAO phantomDAO = new GhostsDAO();
        phantomDAO.InsertGhost(phantom);

    }

}