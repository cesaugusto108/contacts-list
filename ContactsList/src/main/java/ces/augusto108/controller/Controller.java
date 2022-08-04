package ces.augusto108.controller;

import ces.augusto108.model.Dao;
import ces.augusto108.model.entities.Contact;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    private static final long serialVersionUID = 5055545770907679431L;

    Contact contact = new Contact();
    Dao dao = new Dao();

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException {
        switch (request.getServletPath()) {
            case "/Contacts":
                listContacts(response);
                break;
            case "/edit":
                editContact(response);
                break;
            case "/add":
                addContact(response);
                break;
            case "/insert":
                insertContact(request, response);
                break;
            default:
                try {
                    response.sendRedirect("index.html");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    private void listContacts(HttpServletResponse response) {
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void editContact(HttpServletResponse response) {
        try {
            response.sendRedirect("edit.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addContact(HttpServletResponse response) {
        try {
            response.sendRedirect("add.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void insertContact(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            response.sendRedirect("index.jsp");

            contact.setContactName(request.getParameter("name"));
            contact.setEmail(request.getParameter("email"));
            contact.setTelephone(request.getParameter("telephone"));

            dao.insertContact(contact);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
