/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import servlets.registration;

/**
 *
 * @author user
 */
public class connection {

    public static Statement con() {
        Statement st;
        Connection connection;

        try {
            // Load the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // Establish a connection (URL and user and password)
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/users", "root", "root");
            st = connection.createStatement();
            return st;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
