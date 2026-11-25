
import database.ConnexionBD;
import java.sql.Connection;

public class TestConnexion {

    public static void main(String[] args) {

        Connection connection = ConnexionBD.getConnection();

        if (connection != null) {
            System.out.println("================================");
            System.out.println("LUXORA DATABASE CONNECTED!");
            System.out.println("Database: luxora_db");
            System.out.println("================================");

            try {
                connection.close();
                System.out.println("Connection closed successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("DATABASE CONNECTION FAILED!");
        }
    }
}
