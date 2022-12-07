package com.prac.chargesys.dao.impl;

import com.prac.chargesys.dao.DeviceDAO;
import com.prac.chargesys.pojo.Device;

import java.util.List;

/**
 * @ClassName DeviceDAOImpl
 * @Description
 * @Date 2022/11/28 9:31
 * @Version 1.0
 */
public class DeviceDAOImpl extends BaseDao implements DeviceDAO {
    @Override
    public Device getDevice(int id) {
        String sql = "select * from t_device where id = ?";
        Device device = queryForOne(Device.class, sql, id);
        return device;
    }

    @Override
    public void setDeviceStatus(Integer status, Integer id) {
        String sql = "update t_device set status = ? where id = ?";
        update(sql, status, id);
    }

    @Override
    public List<Device> getDeviceList() {
        String sql = "select * from t_device";
        List<Device> deviceList = queryForList(Device.class, sql);
        return deviceList;
    }

}
