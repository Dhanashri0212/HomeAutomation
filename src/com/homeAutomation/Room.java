package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;

public class Room {
	String roomType;
	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	

	public Room(String roomType) {
		super();
		this.roomType = roomType;
	}


	List<Device> devices = new ArrayList<Device>();

	public void checkStatus(String type) {
		
		
	}


}
