package com.prac.chargesys.servlet;

import com.google.gson.Gson;
import com.prac.chargesys.dao.DeviceDAO;
import com.prac.chargesys.dao.OrderDAO;
import com.prac.chargesys.dao.impl.DeviceDAOImpl;
import com.prac.chargesys.dao.impl.OrderDAOImpl;
import com.prac.chargesys.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.List;


/**
 * @ClassName OrderServlet
 * @Description
 * @Date 2022/12/3 21:49
 * @Version 1.0
 */

@WebServlet("/order.do")
public class OrderServlet extends HttpServlet {

    OrderDAO orderDAO = new OrderDAOImpl();
    DeviceDAO deviceDAO = new DeviceDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Writer out = resp.getWriter();

        if ("addOrder".equals(req.getParameter("ope"))) {

            String typeStr = req.getParameter("type");
            int type = Integer.parseInt(typeStr);

            String timeStr = req.getParameter("time");
            Timestamp time = Timestamp.valueOf(timeStr);

            String authorStr = req.getParameter("author");
            int author = Integer.parseInt(authorStr);

            String deviceIdStr = req.getParameter("id");
            int deviceId = Integer.parseInt(deviceIdStr);

            Order order = new Order(1, time, deviceId, author, type);
            orderDAO.addOrder(order);
            deviceDAO.setDeviceStatus(1, deviceId);
            out.write("ok");

        } else {

            Integer userid = Integer.valueOf(req.getParameter("userid"));
            List<Order> orderList = orderDAO.getOrderList(userid);
            System.out.println(orderList);
            String json = new Gson().toJson(orderList);
            out.write(json);

        }
        out.flush();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
