package com.prac.chargesys.dao;

import com.prac.chargesys.pojo.Device;

import java.util.List;

/**
 * @interfaceName DeviceDAO
 * @Description
 * @Date 2022/11/24 16:01
 * @Version 1.0
 */
public interface DeviceDAO {

    /**
     * 获取指定id设备信息
     * @param id
     * @return
     */
    Device getDevice(int id);

    /**
     * 设置设备的状态
     * @param status
     */
    void setDeviceStatus(Integer status, Integer id);

    /**
     * 获取所有的设备信息
     */
    List<Device> getDeviceList();
}
