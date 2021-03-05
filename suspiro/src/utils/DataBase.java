/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khali
 */
public class DataBase {
     String url = "jdbc:mysql://localhost:3306/suspiro";
     String login = "root";
     String pwd = "";
     
    public  static DataBase db;
    
    public Connection con;
    
    private DataBase() {
         try {
             con = DriverManager.getConnection(url, login, pwd);
             System.out.println("connexion etablie");
         } catch (SQLException ex) {
             System.out.println(ex);
             System.out.println("ERREUR");
         }
    }
    
    public Connection  getConnection()
    {
    return con;
    }     
    
    public static DataBase getInstance()
    {if(db==null)
        db=new DataBase();
    return db;
    }  
}
