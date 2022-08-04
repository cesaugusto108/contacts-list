package ces.augusto108.controller;

import ces.augusto108.model.Dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
    private static final long serialVersionUID = 5055545770907679431L;

    Dao dao = new Dao();

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException {
    }
}
