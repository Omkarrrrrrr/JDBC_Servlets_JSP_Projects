package backend;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDBConnection {
    public static void main(String[] args) {
        // Get the connection using DBConnection class
        Connection conn = DBConnection.getConnection();
        
        // Check if the connection is successful
        if (conn != null) {
            System.out.println("Connection established successfully!");
            try {
                // Close the connection when done
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to establish connection.");
        }
    }
}
