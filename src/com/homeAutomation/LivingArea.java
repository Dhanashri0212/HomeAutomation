package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class LivingArea extends Room {

	List<Device> devices = new ArrayList<Device>();
	public LivingArea() {
		devices.add(new Light("Light",false));
		devices.add(new AC("AC",true));
		devices.add(new Fan("Fan",true));
	}

	public LivingArea(String roomType) {
		super(roomType);
	}
	
	
	
}
