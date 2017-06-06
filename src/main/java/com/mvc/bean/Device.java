package com.mvc.bean;

public class Device {

	private int deviceid;
	private String ip,mac, name, type, version, snmpv, snmpr, snmpw;

	public int getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSnmpv() {
		return snmpv;
	}
	public void setSnmpv(String snmpv) {
		this.snmpv = snmpv;
	}
	public String getSnmpr() {
		return snmpr;
	}
	public void setSnmpr(String snmpr) {
		this.snmpr = snmpr;
	}
	public String getSnmpw() {
		return snmpw;
	}
	public void setSnmpw(String snmpw) {
		this.snmpw = snmpw;
	}

}
