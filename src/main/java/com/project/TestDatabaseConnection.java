package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Connection details
        String url = "jdbc:postgresql://localhost:5432/user_management"; // Database name: user_management
        String username = "postgres";  // Replace with your PostgreSQL username
        String password = "your_password_here";  // Replace with your PostgreSQL password

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connection successful!");
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
