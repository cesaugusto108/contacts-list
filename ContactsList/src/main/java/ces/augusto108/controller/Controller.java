package ces.augusto108.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    private static final long serialVersionUID = 5055545770907679431L;

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException {
        switch (request.getServletPath()) {
            case "/Contacts":
                listContacts(response);
                break;
        }
    }

    private void listContacts(HttpServletResponse response) {
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
