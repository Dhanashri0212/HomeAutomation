package com.Devices;

import java.time.LocalTime;

import com.homeAutomation.BedroomDevice;
import com.homeAutomation.KitchenDevice;

public class Fan extends Device implements KitchenDevice,BedroomDevice{

	
	
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

	@Override
	public void control() {
		
		
	}

}
