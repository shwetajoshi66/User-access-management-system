package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Update these details to match your PostgreSQL configuration
    private static final String URL = "jdbc:postgresql://localhost:5432/user_management";
    private static final String USER = "postgres";
    private static final String PASSWORD = "your_password_here"; // Replace with your password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
