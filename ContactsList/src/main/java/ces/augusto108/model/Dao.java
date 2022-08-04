package ces.augusto108.model;

import ces.augusto108.model.entities.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    public void insertContact(Contact contact) {
        String insertQuery = "INSERT INTO Contacts (CONTACT_NAME, EMAIL, TELEPHONE) VALUES (?, ?, ?)";

        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, contact.getContactName());
            preparedStatement.setString(2, contact.getEmail());
            preparedStatement.setString(3, contact.getTelephone());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
