package com.prac.chargesys.dao.impl;

import com.prac.chargesys.dao.UserDAO;
import com.prac.chargesys.pojo.User;

/**
 * @ClassName UserDAOImpl
 * @Description
 * @Date 2022/11/24 16:10
 * @Version 1.0
 */
public class UserDAOImpl extends BaseDao implements UserDAO {
    @Override
    public User getUser(String username, String password) {
        String sql = "select * from t_user where username = ? and password = ?";
        User user = queryForOne(User.class, sql, username, password);
        return user;
    }

    @Override
    public User getUserById(Integer id) {
        String sql = "select * from t_user where id = ?";
        User user = queryForOne(User.class, sql, id);
        return user;
    }

    @Override
    public void addUser(User user) {
        String sql = "insert into t_user(username, password) values(?, ?)";
        update(sql, user.getUserName(), user.getPassword());
    }

    @Override
    public User getUser(String username) {
        String sql = "select * from t_user where username = ?";
        User user = queryForOne(User.class, sql, username);
        return user;
    }
}
