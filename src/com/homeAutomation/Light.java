package com.homeAutomation;

import java.time.LocalTime;

public class Light extends Device implements KitchenDevice {
	

	public Light() {
		super();
	}

//	public Light(String deviceType) {
//		super(deviceType);
//	}
	

	public boolean checkStatus() {
		if(Status == true) {
			return true;
		}
		return false;
		
	}

public Light(String deviceName, boolean status) {
	super(deviceName, status);
}

	

	
	
	

}
