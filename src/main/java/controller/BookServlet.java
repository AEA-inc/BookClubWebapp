package controller;

import Dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class BookServlet extends HttpServlet {
    private BookDao bookDao;
    @Override
    public void init() throws ServletException {
        bookDao=new BookDao();
    }
}
