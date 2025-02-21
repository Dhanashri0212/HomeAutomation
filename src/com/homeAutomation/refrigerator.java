package com.homeAutomation;

import java.time.LocalTime;

public class refrigerator extends Device {
	

	public refrigerator(String deviceType) {
		super(deviceType);
	}
	

	public refrigerator(String deviceName, boolean status) {
		super(deviceName, status);
	}


	
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		return false;
	}

}
