package com.prac.chargesys.dao;

import com.prac.chargesys.pojo.Device;

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
    Device getDevice(Integer id);

}
