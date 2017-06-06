package com.mvc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.mvc.bean.Device;

@Repository()
/* 
 *@Repository là một annotation, nó được sử dụng để chú thích trên một
 * class để nói với Spring rằng class này là một Spring BEAN. 
 * 
 */
public class DeviceDaoImpl implements DeviceDao {
	
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	@Override
	public List<Device> getDevices() {
		// TODO Auto-generated method stub
		List<Device> devices = null;
		try{
		devices= jdbcTemplate.query("SELECT * FROM device",
				new BeanPropertyRowMapper<Device>(Device.class));		
		}catch(Exception e){
			e.printStackTrace();
		}
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
