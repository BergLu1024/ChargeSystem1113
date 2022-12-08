package com.prac.chargesys.servlet;

import com.google.gson.Gson;
import com.prac.chargesys.dao.UserDAO;
import com.prac.chargesys.dao.impl.UserDAOImpl;
import com.prac.chargesys.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserServlet
 * @Description
 * @Date 2022/12/6 17:39
 * @Version 1.0
 */
@WebServlet("/user.do")
public class UserServlet extends HttpServlet {

    UserDAO userDAO = new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Writer out = resp.getWriter();

        if ("login".equals(req.getParameter("ope"))){

            String username = req.getParameter("username");
            String password = req.getParameter("password");
            System.out.println(username + ", " + password);
            User user = userDAO.getUser(username, password);
            User user1 = userDAO.getUser(username);

            Map map = new HashMap();
            if (user != null) {
                map.put("signal", "ok");
                map.put("id", user.getId());
                map.put("username", user.getUserName());
            } else if (user1 != null){
                map.put("signal", "wrong");
            } else{
                map.put("signal", "no");
            }
            String json = new Gson().toJson(map);
            out.write(json);

        } else if ("register".equals(req.getParameter("ope"))){
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            User user = userDAO.getUser(username);
            if (user != null){
                out.write("exist");
            } else {
                userDAO.addUser(new User(username, password));
                out.write("notExist");
            }
        } else {

            System.out.println("usertest");
            String author = req.getParameter("author");
            User user = userDAO.getUserById(Integer.valueOf(author));
            out.write(user.getUserName());

        }

        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
