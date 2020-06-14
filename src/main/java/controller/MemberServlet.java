package controller;

import Dao.MemberDao;
import Model.Member;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class MemberServlet extends HttpServlet {
    private MemberDao memberDao;

    @Override
    public void init() throws ServletException {
        memberDao=new MemberDao();
    }
}
