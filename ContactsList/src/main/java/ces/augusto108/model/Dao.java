package ces.augusto108.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url =
            "jdbc:mysql://127.0.0.1:3306/ContactsList?useTimeZone=true&serverTimeZone=UTC";
    private String user = "root";
    private String password = "1234";

    private Connection connect() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void testConnection() {
        try (Connection connection = connect()) {
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
