/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deo;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
     try   {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","root");
         return con ;   
        }
     catch(Exception e)
             {
                 System.out.println(e);
                 return null;
             }
        
    }
    
}
