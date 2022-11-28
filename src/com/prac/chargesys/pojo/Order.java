package com.prac.chargesys.pojo;

import java.sql.Timestamp;

/**
 * @ClassName Order
 * @Description
 * @Date 2022/11/14 17:49
 * @Version 1.0
 */
public class Order {
    private Integer id;         //主键，不可见
    private Integer status;         //0代表过往订单，1代表现在进行订单
    private Timestamp ordertime;            //代表订单创定时间
    private String duration;           //订单持续时长
    private Integer deviceid;           //设备的id
    private Integer author;          //订单主人


    public Order() {
    }

    public Order(Integer status, Timestamp ordertime, Integer deviceid, Integer author) {
        this.status = status;
        this.ordertime = ordertime;
        this.deviceid = deviceid;
        this.author = author;
    }

    public Integer getUser() {
        return author;
    }

    public void setUser(Integer author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                ", ordertime=" + ordertime +
                ", duration='" + duration + '\'' +
                ", deviceid=" + deviceid +
                '}';
    }
}
