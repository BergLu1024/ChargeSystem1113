package com.prac.chargesys.test;

import com.prac.chargesys.dao.OrderDAO;
import com.prac.chargesys.dao.UserDAO;
import com.prac.chargesys.dao.impl.OrderDAOImpl;
import com.prac.chargesys.dao.impl.UserDAOImpl;
import com.prac.chargesys.pojo.Order;
import com.prac.chargesys.pojo.User;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName OrderDAOTest
 * @Description
 * @Date 2022/11/25 11:09
 * @Version 1.0
 */
public class OrderDAOTest {

    UserDAO userDAO = new UserDAOImpl();
    OrderDAO orderDAO = new OrderDAOImpl();

    @Test
    public void test1(){
        User user = userDAO.getUserById(1);
        List<Order> orderList = orderDAO.getOrderList(user);
        for(Order order : orderList){
            System.out.println(order);
        }
    }

    @Test
    public void test2(){
        orderDAO.addOrder(new Order(0, new Timestamp(new java.util.Date().getTime()), 5, 1));
    }

    @Test
    public void test3(){
        Order order = orderDAO.getOrder(2);
        System.out.println(order);
    }
}
