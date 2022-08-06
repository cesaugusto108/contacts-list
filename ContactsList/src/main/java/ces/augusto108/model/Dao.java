package ces.augusto108.model;

import ces.augusto108.model.entities.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Contact> listContacts() {
        String listContactsQuery = "SELECT * FROM Contacts ORDER BY CONTACT_NAME";

        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(listContactsQuery);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Contact> contactList = new ArrayList<>();

            while (resultSet.next()) {
                String id = resultSet.getString(1);
                String contactName = resultSet.getString(2);
                String email = resultSet.getString(3);
                String telephone = resultSet.getString(4);

                contactList.add(new Contact(id, contactName, email, telephone));
            }

            return contactList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Contact selectContact(String id) {
        String selectContactQuery = "SELECT * FROM Contacts WHERE ID = ?";

        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(selectContactQuery);

            preparedStatement.setString(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            Contact contact = new Contact();

            while (resultSet.next()) {
                contact.setId(resultSet.getString(1));
                contact.setContactName(resultSet.getString(2));
                contact.setEmail(resultSet.getString(3));
                contact.setTelephone(resultSet.getString(4));
            }

            return contact;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateContact(Contact contact) {
        String updateContactQuery = "UPDATE Contacts SET CONTACT_NAME = ?, EMAIL = ?, TELEPHONE = ? WHERE ID = ?";

        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(updateContactQuery);

            preparedStatement.setString(1, contact.getContactName());
            preparedStatement.setString(2, contact.getEmail());
            preparedStatement.setString(3, contact.getTelephone());
            preparedStatement.setString(4, contact.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteContact(Contact contact) {
        String deleteContactQuery = "DELETE FROM Contacts WHERE ID = ?";

        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteContactQuery);

            preparedStatement.setString(1, contact.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
