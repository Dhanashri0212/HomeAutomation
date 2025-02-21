package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitchen extends Room {
	
	List<Device> devices = new ArrayList<Device>();
	
	Scanner sc = new Scanner(System.in);
	public Kitchen() {
//		devices.add(new Light("Light",true));
//		devices.add(new refrigerator("refrigerator",true));
//		devices.add(new Fan("Fan",true));
		
	}
//	
	public Kitchen(String roomType) {
		super(roomType);
		devices.add(new Light("Light",false));
		devices.add(new refrigerator("refrigerator",true));
		devices.add(new Fan("Fan",true));
	
	}
	
	public void checkStatus() {
		System.out.println("Device status in " + roomType + ":");
        for (Device device : devices) {
            System.out.println("- " + device.getDeviceName() + " is " + device.getStatus());
        }
    }
	
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Enter Device name to Trun On");
		String name = sc.next();
		for(Device device:devices) {
			if(device.deviceName.equalsIgnoreCase(name)) {
				device.turnOn();
			}
		}
		
	}
	
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Enter Device name to Trun On");
		String name = sc.next();
		for(Device device:devices) {
			if(device.deviceName.equalsIgnoreCase(name)) {
				device.turnOff();
			}
		}
		
	}
	public void activeTime() {
		System.out.println("Enter Device name ");
		String name = sc.next();
		for(Device device:devices) {
			if(device.deviceName.equalsIgnoreCase(name)) {
				device.activeTime();
			}
		}
	}
}
		

	
	


