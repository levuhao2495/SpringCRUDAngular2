package com.mvc.dao;

import java.util.List;

import com.mvc.bean.Device;

public interface DeviceDao {

	public List<Device> getDevices();
	 public Device getDevice(int deviceid);
	 public int deleteDevice(int deviceid); 
	 public int updateDevice(Device device);
	 public int createDevice(Device device); 
}
