package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import static java.lang.Class.forName;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/katajava";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    static Connection connection;
    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //System.out.println("Connection OK");
        } catch (SQLException|ClassNotFoundException ex) {
            ex.printStackTrace();
            //System.out.println("Connection Error");
        }
        return connection;
    }

}
