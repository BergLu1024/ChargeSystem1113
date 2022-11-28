package com.prac.chargesys.pojo;

import java.util.Arrays;

/**
 * @ClassName User
 * @Description
 * @Date 2022/11/13 11:56
 * @Version 1.0
 */
public class User {
    private Integer id;         //用户id,自增，唯一
    private String username;          //用户名，唯一
    private String password;            //密码
    private Order[] orderList;          //用户订单列表
    private Feedback[] feedbackList;            //用户反馈信息列表

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Order[] getOrderList() {
        return orderList;
    }

    public void setOrderList(Order[] orderList) {
        this.orderList = orderList;
    }

    public Feedback[] getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(Feedback[] feedbackList) {
        this.feedbackList = feedbackList;
    }


}
