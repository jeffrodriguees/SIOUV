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
public class DataBase {
    
   public Connection getCon() throws ClassNotFoundException, SQLException{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://192.168.2.130:1433;databaseName = Smart", "sa", "SmartVer2016");
//            Connection con = DriverManager.getConnection("jdbc:sqlserver://SMART_BK:1433;databaseName = Smart_bk", "sa", "SmartVer2016");
       return con;
    }
    
}
