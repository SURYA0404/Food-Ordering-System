package org.example;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
    private final static String URL = "jdbc:mysql://localhost:3306/foodorder";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "admin";


 static Connection getConnection()
 {
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("Class is Found is Sucessfully");
     } catch (ClassNotFoundException e) {
         System.out.println("Class is not found Sucessfully");
     }
      try {
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
          System.out.println("Connection is sucessfully");
          return connection;

      } catch (SQLException e) {
          System.out.println("Connection is not sucessfully");
      }
      return null;
 }
}
