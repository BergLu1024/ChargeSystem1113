package com.prac.chargesys.test;

import com.prac.chargesys.dao.UserDAO;
import com.prac.chargesys.dao.impl.UserDAOImpl;
import com.prac.chargesys.pojo.User;
import org.junit.Test;

/**
 * @ClassName UserDAOTest
 * @Description
 * @Date 2022/11/25 9:30
 * @Version 1.0
 */
public class UserDAOTest {

    @Test
    public void test1(){
        UserDAO userDAO = new UserDAOImpl();
        User user = userDAO.getUser("admin", "admin");
        System.out.println(user.getUserName() + " ," + user.getPassword());
    }

    @Test
    public void test2(){
        UserDAO userDAO = new UserDAOImpl();
        User user = userDAO.getUserById(2);
        System.out.println(user.getUserName());
    }

    @Test
    public void test3(){
        UserDAO userDAO = new UserDAOImpl();
        userDAO.addUser(new User("Lucy", "pass123"));
    }
}
