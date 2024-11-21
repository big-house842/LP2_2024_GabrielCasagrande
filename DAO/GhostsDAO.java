package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connected.Linked;
import Modelos.*;

public class GhostsDAO {
    
    public void insertGhost(Ghost phantoms){

        String sql = "Insert Into Ghosts (Name, Strenght and Size)";

        try(Connection conect = new Linked().Link()) {
            
            PreparedStatement stmt = conect.prepareStatement(sql);

            stmt.setString(1, phantoms.ReturnNameGhost());
            stmt.setInt(2, phantoms.ReturnStrength());
            stmt.setInt(3, phantoms.ReturnSize());
        
            stmt.executeUpdate();
            System.out.println(" Ghost insered whit sucess ");

        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
