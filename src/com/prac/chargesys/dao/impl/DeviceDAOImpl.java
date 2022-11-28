package com.prac.chargesys.dao.impl;

import com.prac.chargesys.dao.DeviceDAO;
import com.prac.chargesys.pojo.Device;

/**
 * @ClassName DeviceDAOImpl
 * @Description
 * @Date 2022/11/28 9:31
 * @Version 1.0
 */
public class DeviceDAOImpl extends BaseDao implements DeviceDAO {
    @Override
    public Device getDevice(Integer id) {
        String sql = "select * from t_device where id = ?";
        Device device = queryForOne(Device.class, sql, id);
        return device;
    }
}
