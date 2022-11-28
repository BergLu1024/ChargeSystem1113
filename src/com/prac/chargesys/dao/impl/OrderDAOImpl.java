package com.prac.chargesys.dao.impl;

import com.prac.chargesys.dao.OrderDAO;
import com.prac.chargesys.pojo.Order;
import com.prac.chargesys.pojo.User;

import java.util.List;

/**
 * @ClassName OrderDAOImpl
 * @Description
 * @Date 2022/11/25 9:50
 * @Version 1.0
 */
public class OrderDAOImpl extends BaseDao implements OrderDAO {
    @Override
    public List<Order> getOrderList(User user) {
        String sql = "select * from t_order where author = ?";
        List<Order> orderList = queryForList(Order.class, sql, user.getId());
        return orderList;
    }

    @Override
    public void addOrder(Order order) {
        String sql = "insert into t_order(status, ordertime, deviceid, author) values (?, ?, ?, ?)";
        update(sql, order.getStatus(), order.getOrdertime(), order.getDeviceid(), order.getUser());
    }

    @Override
    public Order getOrder(Integer id) {
        String sql = "select * from t_order where id = ?";
        Order order = queryForOne(Order.class, sql, id);
        return order;
    }
}
