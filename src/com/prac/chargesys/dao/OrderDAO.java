package com.prac.chargesys.dao;

import com.prac.chargesys.pojo.Order;
import com.prac.chargesys.pojo.User;

import java.util.List;

/**
 * @interfaceName OrderDAO
 * @Description
 * @Date 2022/11/23 9:36
 * @Version 1.0
 */
public interface OrderDAO {

    /**
     * 获取用户的订单列表
     * @param user
     * @return 成功则返回List，失败返回null
     */
    List<Order> getOrderList(Integer author);

    /**
     * 添加订单
     * @param order
     */
    void addOrder(Order order);

    /**
     * 根据订单id获取指定订单详细信息
     * @param id
     * @return
     */
    Order getOrder(Integer id);
}
