package com.mvc.service;

import java.util.List;

import com.mvc.bean.Device;

public interface DeviceService {

	public List<Device> getDevices();
	public Device getDevice(int deviceid);
	public int deleteDevice(int deviceid);
	public int updateDevice(Device device);
	public int createDevice(Device device);
}
