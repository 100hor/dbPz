package com.dbApp.database;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;

@Slf4j
public class ConnectionFactory {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/phoneshop";
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "postgres";


    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public static Connection getConnection() {
        return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }
}
