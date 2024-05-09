/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;
import java.sql.DriverManager;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;

/**
 *
 * @author Souhaila
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/studentdata?useSSL=false", "root", "");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
