package com.homeAutomation;

import java.time.LocalTime;

public class Fan extends Device implements Kithchen{

	
	
	public Fan(String deviceName, boolean status) {
		super(deviceName, status);
	}

	public Fan(String deviceType) {
		super(deviceType);
	}

	public boolean checkStatus() {
		if(Status == true) {
			return true;
		}
		return false;
		
	}

}
