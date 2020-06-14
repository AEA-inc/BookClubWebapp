package controller;

import Dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet
public class BookServlet extends HttpServlet {
    private BookDao bookDao;
    @Override
    public void init() throws ServletException {
        bookDao=new BookDao();
    }
}
