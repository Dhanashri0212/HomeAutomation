package com.homeAutomation;

import java.time.LocalTime;

public class Showers extends Device {

	public Showers(String deviceType, boolean powerStatus, LocalTime onTime, LocalTime offTime) {
		super(deviceType, powerStatus, onTime, offTime);
	}
	public boolean checkStatus() {
		if(powerStatus == true) {
			return true;
		}
		return false;
		
	}

}
