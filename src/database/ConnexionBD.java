package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {

    private static final String URL =
            "jdbc:mysql://localhost:3306/luxora_db?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion à la base de données LUXORA réussie !");

        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données !");
            e.printStackTrace();
        }

        return connection;
    }
}
