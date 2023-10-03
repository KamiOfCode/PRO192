/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huylh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thich
 */
public class DBHelper {
    public static Connection createConnection()
            throws ClassNotFoundException, SQLException {
        //1. load driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //2. Create connection String url
        String url = "jdbc:sqlserver://KAMI:1433;databaseName=SE1707";
        //3. Open connection
        Connection con = DriverManager.getConnection(url, "sa", "12345678");

        return con;
    }
}
