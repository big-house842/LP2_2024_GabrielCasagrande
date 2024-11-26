package DAO;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BancoDeDados.Conexao;
import Models.Ghost;

public class GhostsDAO {

    public void InsertGhostBD(Ghost phantoms) {

        String sql = "Insert Into Ghost (nameGhost, strength, size) values(?,?,?)";

        try (Connection conect = new Conexao().Conectar()) {

            PreparedStatement stmt = conect.prepareStatement(sql);

            stmt.setString(1, phantoms.ReturnNameGhost());
            stmt.setInt(2, phantoms.ReturnStrength());
            stmt.setInt(3, phantoms.ReturnSize());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }


    public static ArrayList<Ghost> TakeOutGhostsBD(ArrayList<Ghost> listPhantom) {
        String sql = "SELECT * FROM Ghost";
        Ghost phantom = new Ghost();

        try (Connection connection = new Conexao().Conectar()) {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("nameGhost");
                int strength = rs.getInt("strength");
                int size = rs.getInt("size");

                phantom.ReadGhostWithID(id, name, strength, size);

                listPhantom.add(phantom);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listPhantom;
    }

}
