package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DAOLayer {
    public static void selectQuery(Connection conn,FoodOrder fd)
    {
        try {
            String query = "SELECT * FROM food";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next())
            {

                int oid = resultSet.getInt(1);
                String customer =resultSet.getString(2);
                String dadress =resultSet.getString(3);
                int items = resultSet.getInt(4);
                int quantity = resultSet.getInt(5);
                int price = resultSet.getInt(6);
                String statues =resultSet.getString(7);
                System.out.println(oid+" " +customer+" "+dadress+" "+items+" "+quantity+
                        " "+price+" "+statues+" ");
            }
            System.out.println("record printed successfully");
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static void insertquery(Connection connection,FoodOrder fd) {
        try {
            String query = "INSERT INTO food VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, fd.getOid());
            ps.setString(2, fd.getCustomber());
            ps.setString(3, fd.getDaddress());
            ps.setInt(4, fd.getItems());
            ps.setInt(5, fd.getQuantity());
            ps.setInt(6, fd.getPrice());
            ps.setString(7, fd.getStatues());
            ps.execute();
            System.out.println("Inserted Sucessfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updatequery(Connection connection, FoodOrder fd) {
        try {
            // Correct query with placeholders
            String query = "UPDATE food SET customer_name = ?, daddress = ?, items = ?, quantity = ?, price = ?, statues = ? WHERE id = ?";

            // Prepare the statement
            PreparedStatement ps = connection.prepareStatement(query);

            // Set the parameters
            ps.setString(1, fd.getCustomber());
            ps.setString(2, fd.getDaddress());
            ps.setInt(3, fd.getItems());
            ps.setInt(4, fd.getQuantity());
            ps.setInt(5, fd.getPrice());
            ps.setString(6, fd.getStatues());
            ps.setInt(7, fd.getOid()); // Corresponding to the WHERE clause

            // Execute the query
            ps.execute();
            System.out.println("Updated Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deletequery(Connection connection, FoodOrder fd) {
        try {
            // DELETE query with a placeholder for the WHERE clause
            String query = "DELETE FROM food WHERE id = ?";

            // Prepare the statement
            PreparedStatement ps = connection.prepareStatement(query);

            // Set the parameter
            ps.setInt(1, 1); // The ID of the row to delete

            // Execute the query
            int rowsAffected = ps.executeUpdate(); // Use executeUpdate for DELETE queries
            if (rowsAffected > 0) {
                System.out.println("Deleted successfully");
            } else {
                System.out.println("No rows found with the given ID");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
