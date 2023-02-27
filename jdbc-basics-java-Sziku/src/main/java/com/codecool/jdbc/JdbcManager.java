package com.codecool.jdbc;

import java.sql.*;

public class JdbcManager {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/people_db";

    static final String USER = "your username";
    static final String PASS = "your password";

    public void showPeopleWithData() {
        String SQL = ""; // put your query here

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleUnder18() {
        String SQL = ""; // put your query here

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleFromNewYorkCity() {
        String SQL = ""; // put your query here

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleWhoseNamesStartWithC() {
        String SQL = ""; // put your query here

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showPeopleOrderedByName() {
        String SQL = ""; // put your query here

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // execute your statement and print the results

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
