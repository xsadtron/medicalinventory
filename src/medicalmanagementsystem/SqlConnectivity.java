/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class SqlConnectivity {
         
            public static Connection connect()
            {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_inventory","root","root");
                    return con;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                    
                }
            }
}
