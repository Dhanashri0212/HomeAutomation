package com.Devices;

import java.time.LocalTime;
import java.util.Scanner;

import com.homeAutomation.BedroomDevice;
import com.homeAutomation.CorridorDevices;
import com.homeAutomation.KitchenDevice;

public class Light extends Device implements KitchenDevice,BedroomDevice,CorridorDevices{
	
	Scanner sc = new Scanner(System.in);
	public Light() {
		super();
	}

	public boolean checkStatus() {
		if(Status == true) {
			return true;
		}
		return false;
	}

public Light(String deviceName, boolean status) {
	super(deviceName, status);
}
@Override
public void control() {
	System.out.println("Do you want to: ");
	System.out.println("1. Turn ON a Device");
	System.out.println("2. Turn OFF a Device");
	System.out.println("Enter your choice");
	int ch = sc.nextInt();
	if(ch == 1) {
		turnOn();	
	}
	else if(ch == 2) {
		turnOff();
	}
	else {
		return;
	}
	
}

	

	
	
	

}
