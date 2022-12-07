package com.prac.chargesys.pojo;

import java.sql.Timestamp;

/**
 * @ClassName Order
 * @Description
 * @Date 2022/11/14 17:49
 * @Version 1.0
 */
public class Order {
    private int id;         //主键，不可见
    private int status;         //0代表过往订单，1代表现在进行订单
    private Timestamp ordertime;            //代表订单创定时间
    private int deviceid;           //设备的id
    private int author;          //订单主人
    private int time;


    public Order() {
    }

    public Order(int status, Timestamp ordertime, int deviceid, int author, int time) {

        this.status = status;
        this.ordertime = ordertime;
        this.deviceid = deviceid;
        this.author = author;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(int deviceid) {
        this.deviceid = deviceid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                ", ordertime=" + ordertime +
                ", time='" + time + '\'' +
                ", deviceid=" + deviceid +
                '}';
    }
}
