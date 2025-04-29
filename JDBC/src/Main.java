import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // Modern way of JDBC
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "MySQL";
        //String query = "INSERT INTO students (id, name) VALUES (110, 'Matija')"; -> Bad way

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)")) {

            preparedStatement.setInt(1, 110);
            preparedStatement.setString(2, "Matija");
            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }



        // Old way of JDBC

//
//        // Database URL, username, and password
//
//        //  database name
//        String url = "jdbc:mysql://localhost:3306/school";
//
//        // MySQL username
//        String username = "root";
//
//        //  MySQL password
//        String password = "MySQL";
//
//        // Updated query syntax for modern databases
//        String query = "INSERT INTO students (id, name) VALUES (110, 'Matija')";
//
//        // Establish JDBC Connection
//        try {
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection c = DriverManager.getConnection(
//                    url,
//                    username,
//                    password);
//
//            // Create a statement
//            Statement st = c.createStatement();
//
//            // Execute the query
//            int count = st.executeUpdate(query);
//            System.out.println(
//                    "Number of rows affected by this query: "
//                            + count);
//
//            // Close the connection
//            st.close();
//            c.close();
//            System.out.println("Connection closed.");
//
//        } catch (SQLException e) {
//            System.err.println("SQL Error: " +
//                    e.getMessage());
//        } catch (ClassNotFoundException e) {
//            System.err.println("JDBC Driver not found.");
//        }

    }
}