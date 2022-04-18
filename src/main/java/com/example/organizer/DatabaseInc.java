package com.example.organizer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInc {



    public void connectWithDatabase() {
        Connection connection = null;
        try {
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            connection = DriverManager.getConnection(url);

            System.out.println("Got it!");

        } catch (SQLException exception) {
            throw new Error("Problem", exception);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
