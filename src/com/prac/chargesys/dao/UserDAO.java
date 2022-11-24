package com.prac.chargesys.dao;

import com.prac.chargesys.pojo.Feedback;
import com.prac.chargesys.pojo.Order;
import com.prac.chargesys.pojo.User;

import java.util.List;

/**
 * @interfaceName UserDAO
 * @Description
 * @Date 2022/11/23 9:18
 * @Version 1.0
 */
public interface UserDAO {

    /**
     * 根据用户名密码获取特定用户信息
     *
     * @param username
     * @param password
     * @return 成功则返回User对象，失败返回null
     */
    User getUser(String username, String password);

    /**
     * 根据用户唯一id，获取该用户的订单列表
     * @param id
     * @return 成功则返回List，失败返回null
     */
    List<Order> getOrderList(Integer id);

    /**
     * 根据用户唯一id，获取该用户反馈信息列表。
     * @param id
     * @return 成功则返回List，失败返回null
     */
    List<Feedback> getFeedbackList(Integer id);

    /**
     * 根据用户id获取用户信息
     * @param id
     * @return 成功返回User对象，失败返回null
     */
    User getUserById(Integer id);
}
