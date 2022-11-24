package com.prac.chargesys.pojo;

import java.util.Date;

/**
 * @ClassName Order
 * @Description
 * @Date 2022/11/14 17:49
 * @Version 1.0
 */
public class Order {
    private Integer status;         //0代表过往订单，1代表现在进行订单
    private Integer orderid;            //order的编号，唯一，作为主码
    private Date ordertime;            //代表订单创定时间
    private Integer duration;           //订单持续时长
    private Integer deviceid;           //设备的id

    public Order() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }
}
