package com.prac.chargesys.servlet;

import com.google.gson.Gson;
import com.prac.chargesys.dao.DeviceDAO;
import com.prac.chargesys.dao.impl.DeviceDAOImpl;
import com.prac.chargesys.pojo.Device;
import com.prac.chargesys.pojo.Order;
import com.prac.chargesys.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DeviceServlet
 * @Description
 * @Date 2022/12/6 9:37
 * @Version 1.0
 */
@WebServlet("/device.do")
public class DeviceServlet extends HttpServlet {

    DeviceDAO deviceDAO = new DeviceDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer out = resp.getWriter();
        Map map = new HashMap();
        String json = "";
        if ("scan".equals(req.getParameter("ope"))){
            String id = req.getParameter("id");
            Device device = deviceDAO.getDevice(Integer.valueOf(id));

            if (device.getStatus() == 0){
                map.put("signal", "ok");
                map.put("location", device.getLocation());
            } else {
                map.put("signal", "no");
            }
            json = new Gson().toJson(map);

        } else {
            List<Device> deviceList = deviceDAO.getDeviceList();
            json = new Gson().toJson(deviceList);
        }

        System.out.println("11111111");
        out.write(json);
        out.flush();


    }
}
