package controller;

import Dao.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class AdminServlet extends HttpServlet {
    private AdminDao adminDao;
    @Override
    public void init() throws ServletException {
       adminDao= new AdminDao();
    }
}
