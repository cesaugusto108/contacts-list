package ces.augusto108.controller;

import ces.augusto108.model.Dao;
import ces.augusto108.model.entities.Contact;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
                listContacts(request, response);
                break;
            case "/edit":
                editContact(request, response);
                break;
            case "/add":
                addContact(response);
                break;
            case "/insert":
                insertContact(request, response);
                break;
            case "/update":
                updateContact(request, response);
                break;
            case "/confirm":
                confirmDelete(request, response);
                break;
            case "/delete":
                deleteContact(request, response);
                break;
            default:
                try {
                    response.sendRedirect("Contacts");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    private void listContacts(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            List<Contact> contactList = dao.listContacts();

            request.setAttribute("Contacts", contactList);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(request, response);
        } catch (IOException | ServletException e) {
            throw new RuntimeException(e);
        }
    }

    private void editContact(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            Contact selectedContact = dao.selectContact(request.getParameter("id"));

            request.setAttribute("Contact", selectedContact);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit.jsp");
            requestDispatcher.forward(request, response);
        } catch (IOException | ServletException e) {
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
            contact.setContactName(request.getParameter("name"));
            contact.setEmail(request.getParameter("email"));
            contact.setTelephone(request.getParameter("telephone"));

            dao.insertContact(contact);

            response.sendRedirect("Contacts");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateContact(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            contact.setId(request.getParameter("id"));
            contact.setContactName(request.getParameter("name"));
            contact.setEmail(request.getParameter("email"));
            contact.setTelephone(request.getParameter("telephone"));

            dao.updateContact(contact);

            response.sendRedirect("Contacts");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteContact(
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        try {
            contact.setId(request.getParameter("id"));
            System.out.println(contact.getId());
            dao.deleteContact(contact);

            response.sendRedirect("Contacts");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void confirmDelete(
            HttpServletRequest request,
            HttpServletResponse response) {
        try {
            Contact selectedContact = dao.selectContact(request.getParameter("id"));

            request.setAttribute("Contact", selectedContact);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete.jsp");
            requestDispatcher.forward(request, response);
        } catch (IOException | ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
