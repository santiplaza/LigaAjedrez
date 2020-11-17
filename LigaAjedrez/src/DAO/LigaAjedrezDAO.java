package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enrique
 */
public class LigaAjedrezDAO {
    
    private Connection conexionBD;
    
    public LigaAjedrezDAO(){
        
        String bd = "jdbc:mysql://localhost:3306/LigaAjedrezBD";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexionBD = DriverManager.getConnection(bd, "root", "12345678");
        } catch (Exception e) { 
        
        System.out.println("Error de conexión");
        System.out.println(e.getMessage());
        }
    
    }
    
    public boolean isConnected()
    {
        return conexionBD != null;
    }
    
}
