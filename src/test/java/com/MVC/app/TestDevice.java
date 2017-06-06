package com.MVC.app;

import java.util.ArrayList;
import org.springframework.context.*;
import org.springframework.context.support.*;
import java.util.List;


import com.mvc.bean.Device;
import com.mvc.dao.DeviceDao;


public class TestDevice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config-mvc.xml");
		DeviceDao deviceDao = context.getBean(DeviceDao.class);
		List<Device> listDevice= new ArrayList<Device>();
		listDevice=(List<Device>) deviceDao.getDevices();
		System.out.println("-----VIEW LIST------");
		if(listDevice.size()==0){
			System.out.println("No structure!");
		}else{
			for(Device i : listDevice){
				System.out.println("-----"+i+"------");
				System.out.println("Id: "+i.getDeviceid());
				System.out.println("Name: "+i.getIp());
				System.out.println("Author: "+i.getMac());
			}
		}
	}

}

