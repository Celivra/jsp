package com.celivra.javawebendhomework.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/jsp";
        String user = "root";
        String password = "940727";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
