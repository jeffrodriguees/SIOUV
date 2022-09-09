/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jefersonrodrigues
 */
public class DataBasePG {

    public Connection getCon() throws ClassNotFoundException, SQLException {
//            Class.forName("org.postgresql.Driver");
//            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:3128/postgres", "postgres", "postgree");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.2.138/SIOUV?user=root&password=Tudode15@");
//        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.2.138/TESTE?user=root&password=Tudode15@");
        return con;
    }
}
