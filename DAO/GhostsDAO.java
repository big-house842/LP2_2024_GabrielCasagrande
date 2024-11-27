package DAO;

import java.sql.*;
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

            stmt.executeUpdate();// Altera a tabela no DB

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public static void OrderDB(String column){
        String sql = "SELECT * FROM Ghost ORDER BY " + column.toLowerCase() + " DESC";// ? Não funciona para colunas ou parêmetros

        try (Connection conect = new Conexao().Conectar()){

            PreparedStatement stmt = conect.prepareStatement(sql);

            stmt.executeQuery();// Executa a linha de comando no sql

        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static ArrayList<Ghost> TakeOutGhostsBD(ArrayList<Ghost> listPhantom) {
        String sql = "SELECT * FROM Ghost";

        try (Connection connection = new Conexao().Conectar()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Ghost phantom = new Ghost();
                phantom.ReadGhostWithID(rs.getInt("id"), rs.getString("nameGhost"), rs.getInt("strength"), rs.getInt("size"));

                listPhantom.add(phantom);

            }
            return listPhantom;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Ghost SearchBD(String column, int value){
        Ghost phantom = null; 
        String sql = "SELECT * FROM Ghost WHERE " + column.toLowerCase() + " = ?"; // Construir a consulta SQL com a coluna diretamente
    
        try (Connection connection = new Conexao().Conectar()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, value);  // Substituir o "?" pelo valor de 'value'
    
            ResultSet rs = stmt.executeQuery();
    
            if (rs.next()) {
                phantom = new Ghost();
                phantom.ReadGhostWithID(rs.getInt("id"), rs.getString("nameGhost"), rs.getInt("strength"), rs.getInt("size"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return phantom;
    }

    public static void DeleteDB(String column, int value){
        String sql = "DELETE FROM Ghost WHERE " + column.toLowerCase() + " = ?";

        try(Connection connection = new Conexao().Conectar()){

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, value);

            stmt.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }

    }

}
