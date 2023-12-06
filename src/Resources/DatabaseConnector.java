package Resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/librarymanagement";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            // Step 1: Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // Perform database operations here

                // Step 3: Close the connection when done
                connection.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
