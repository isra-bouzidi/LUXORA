import database.ConnexionBD;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection connection = ConnexionBD.getConnection();

        if (connection != null) {
            System.out.println("LUXORA is ready to start!");

            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Unable to connect to the database.");
        }
    }
}