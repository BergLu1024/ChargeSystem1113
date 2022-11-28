package com.prac.chargesys.test;

import com.prac.chargesys.dao.DeviceDAO;
import com.prac.chargesys.dao.impl.DeviceDAOImpl;
import com.prac.chargesys.pojo.Device;
import org.junit.Test;

/**
 * @ClassName DeviceDAOTest
 * @Description
 * @Date 2022/11/28 9:33
 * @Version 1.0
 */
public class DeviceDAOTest {
    DeviceDAO deviceDAO = new DeviceDAOImpl();

    @Test
    public void test1(){
        Device device = deviceDAO.getDevice(2);
        System.out.println(device);
    }
}
