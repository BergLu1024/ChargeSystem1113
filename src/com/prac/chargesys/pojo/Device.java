package com.prac.chargesys.pojo;

/**
 * @ClassName Device
 * @Description
 * @Date 2022/11/14 18:04
 * @Version 1.0
 */
public class Device {
    private int id;         //设备id,唯一,作为主码
    private int status;         //设备状态，0为未使用，1为使用中
    private String location;        //设备位置

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Device() {
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
}
