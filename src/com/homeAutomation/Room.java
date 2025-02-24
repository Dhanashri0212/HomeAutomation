package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {
	String roomType;
	double NumberofDevices;
	public String getRoomType() {
		return roomType;
	}
	public Room() {
		super();
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Room(String roomType) {
		super();
		this.roomType = roomType;
	}
	public abstract void checkStatus();
	public abstract void turnOn();
	public abstract void turnOff(); 
	public abstract void activeTime();
		// TODO Auto-generated method stub
	public abstract int addDevice() throws DeviceNotFound;
	protected abstract void Display();
	public abstract void controlDevice();
		
	
		
	


}
