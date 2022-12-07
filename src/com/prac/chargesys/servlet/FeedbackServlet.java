package com.prac.chargesys.servlet;

import com.prac.chargesys.dao.FeedbackDAO;
import com.prac.chargesys.dao.impl.FeedbackDAOImpl;
import com.prac.chargesys.pojo.Feedback;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * @ClassName FeedbackServlet
 * @Description
 * @Date 2022/12/6 15:59
 * @Version 1.0
 */
@WebServlet("/feedback.do")
public class FeedbackServlet extends HttpServlet {

    FeedbackDAO feedbackDAO = new FeedbackDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone = req.getParameter("phone");
        String feedback = req.getParameter("feedback");
        String authorStr = req.getParameter("author");
        int author = Integer.parseInt(authorStr);

        feedbackDAO.addFeedback(new Feedback(author, feedback, phone));
        System.out.println("111");
        Writer out = resp.getWriter();
        out.write("ok");
        out.flush();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
