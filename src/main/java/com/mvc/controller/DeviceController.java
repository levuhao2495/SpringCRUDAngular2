package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.bean.Device;
import com.mvc.service.DeviceService;

@RestController(value="/apidevice")
public class DeviceController {
	@Autowired
	DeviceController (){}
	private DeviceService deviceService;
	
	//get all device
	@RequestMapping(value="/device", method = RequestMethod.GET)
	public ResponseEntity<List<Device>> devices(){
		
		HttpHeaders headers= new HttpHeaders();
		List<Device>devices= this.deviceService.getDevices();
		
		if( devices == null){
			return new ResponseEntity<List<Device>>(HttpStatus.NOT_FOUND);
		}
		headers.add("Number Of Records Found", String.valueOf(devices.size()));
		return new ResponseEntity<List<Device>>(devices,headers,HttpStatus.OK);		
	}

	
	
	
	
}
