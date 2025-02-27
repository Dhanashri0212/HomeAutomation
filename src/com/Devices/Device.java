package com.Devices;


import java.time.Duration;
import java.time.LocalTime;

public abstract class Device  {
	String deviceName;
	boolean Status = true;
	LocalTime onTime = LocalTime.now();
	LocalTime offTime = LocalTime.now();

	public Device() {
	super();
	
}
	public Device(String deviceName, boolean status) {
		super();
		this.deviceName = deviceName;
		Status = status;
	}
	public Device(String deviceName) {
		super();
		this.deviceName = deviceName;
		
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getStatus() {
		return Status ? "ON" : "OFF";
	}
	public void setStatus(boolean Status) {
		this.Status = Status;
	}
	public LocalTime getOnTime() {
		return onTime;
	}
	public void setOnTime(LocalTime onTime) {
		this.onTime = onTime;
	}
	public LocalTime getOffTime() {
		return offTime;
	}
	public void setOffTime(LocalTime offTime) {
		this.offTime = offTime;
	}
	
	
	public boolean turnOn() {
		if(Status == false) {
			Status = true;
			onTime = LocalTime.now();
	        System.out.println("Turned on at " + onTime);
			return Status;
		}
	return false;
	}
	
	public boolean turnOff() {
		if(Status == true) {
			Status = false;
			offTime = LocalTime.now();

	        System.out.println("Turned OFF at " + offTime);
			return Status;
		}

	return true;
	}
	
	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", Status=" + Status + ", onTime=" + onTime + ", offTime=" + offTime
				+ "]";
	}
	public void activeTime() {
		Duration duration = Duration.between(onTime,offTime);
		System.out.println(deviceName+"active for "+duration.toHours()+"h "+ duration.toMinutesPart()+"m "+duration.toSecondsPart()+"s");

	}
//	public  boolean checkStatus();
//		
//	public abstract void tempController();
	public abstract void control(); 
	


	
}

