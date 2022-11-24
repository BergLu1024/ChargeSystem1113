package com.prac.chargesys.pojo;

/**
 * @ClassName Device
 * @Description
 * @Date 2022/11/14 18:04
 * @Version 1.0
 */
public class Device {
    private Integer id;         //设备id,唯一,作为主码
    private Integer status;         //设备状态，0为未使用，1为使用中

    public Device() {
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
}
