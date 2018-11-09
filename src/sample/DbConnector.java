package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private Connection connection;
    private String url = "jdbc:sqlite:db.db";

    public Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url);
            if (connection != null) {
                System.out.println("Connected to sqlite");
            } else {
                System.out.println("Connection failed");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("No DBMS");
        }
        return connection;
    }
}
