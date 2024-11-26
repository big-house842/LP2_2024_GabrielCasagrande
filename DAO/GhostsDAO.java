package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.Conectar;
import Models.Ghost;

public class GhostsDAO {
    
    public void InsertGhost(Ghost phantoms){

        String sql = "Insert Into Ghost (nameGhost, strength, size) values(?,?,?)";

        try(Connection conect = new Conectar().Conexao()) {
            
            PreparedStatement stmt = conect.prepareStatement(sql);

            stmt.setString(1, phantoms.ReturnNameGhost());
            stmt.setInt(2, phantoms.ReturnStrength());
            stmt.setInt(3, phantoms.ReturnSize());
        
            stmt.executeUpdate();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
