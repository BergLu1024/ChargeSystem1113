package com.prac.chargesys.servlet;

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
 * @ClassName Servlet
 * @Description
 * @Date 2022/12/1 19:29
 * @Version 1.0
 */
@WebServlet("/a.do")
public class Servlet extends HttpServlet {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        /*设置响应头允许ajax跨域访问*/
        resp.setHeader("Access-Control-Allow-Origin", "*");

        /* 星号表示所有的异域请求都可以接受， */
        resp.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序传递的参数值并打印
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + ", " + password);
        Writer out = resp.getWriter();
        User user = userDAO.getUser(username, password);

//        Map map = new HashMap();
//        if(user != null){
//            map.put("signal", "ok");
//            map.put("id", user.getId());
//        }else {
//            map.put("signal", "no");
//        }
//        String json = new Gson().toJson(result);
//        out.write(json);
//        out.write(map);
        out.write("ok");
        out.flush();
    }
}
