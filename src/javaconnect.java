/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lakshmi Mounika
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    public static Connection ConnecrDb()
    {
        try
           
        {
            Class.forName("org.sqlite.JDBC");
            //Connection conn=DriverManager.getConnection("jdbc:sqlite:C:/Users/Lakshmi Mounika/Documents/NetBeansProjects/Library Management System/librarynewDB.db");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lakshmi Mounika\\OneDrive\\Documents\\Database\\librarynewDB.db");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
