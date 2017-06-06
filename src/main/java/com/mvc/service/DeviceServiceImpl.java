package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.bean.Device;
import com.mvc.dao.DeviceDao;

@Service("deviceService")
/* The @Service annotation is also a specialization of the component annotation.
 *  It doesn’t currently provide any additional behavior over the @Component annotation, 
 *  but it’s a good idea to use @Service over @Component in service-layer classes
 *   because it specifies intent better. Additionally,
 *    tool support and additional behavior might rely on it in the future.*/
public class DeviceServiceImpl implements DeviceService{

	@Autowired
/*
 * @Autowired duoc chu thich tren not truong (field) de noi voi Spring 
 * hay gan (inject) gia tri vao trong truong do
 *   
 * 
 */
	private DeviceDao deviceDao;
	@Override
	public List<Device> getDevices() {
		// TODO Auto-generated method stub
		List<Device> devices=deviceDao.getDevices();
		return devices;
	}

	@Override
	public Device getDevice(int deviceid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteDevice(int deviceid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDevice(Device device) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createDevice(Device device) {
		// TODO Auto-generated method stub
		return 0;
	}

}
