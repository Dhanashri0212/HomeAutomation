package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitchen extends Room implements TemperatureControllerDevices {
	
	List<Device> devices = new ArrayList<Device>();
	
	Scanner sc = new Scanner(System.in);
	public Kitchen() {
	}
	public Kitchen(String roomType) {
		super(roomType);
		devices.add(new Light("Light",false));
		devices.add(new refrigerator("refrigerator",true));
		devices.add(new Fan("Fan",true));
	
	}
	public void checkStatus() {
		System.out.println("------------------------------------");
		System.out.println("Device status in " + roomType + ":");
        for (Device device : devices) {
            System.out.println("- " + device.getDeviceName() + " is " + device.getStatus());
        }
        System.out.println("------------------------------------\n");
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
		System.out.println("Enter Device name to Trun Off");
		String name = sc.next();
		for(Device device:devices) {
			if(device.deviceName.equalsIgnoreCase(name)) {
				device.turnOff();
			}
		}	
	}
	
	public void activeTime() {
		for(Device device:devices) {
				device.activeTime();
			}
	}

	public int addDevice() throws DeviceNotFound {
		for(Device device:devices) {
			System.out.println(device.deviceName);
		}

		while(true) {

			System.out.println("Enter Device Name:");
			String ch = sc.nextLine();
			if(ch.equalsIgnoreCase("Light")) {
				 devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.deviceName.equalsIgnoreCase("Light"));
				 devices.add(new Light("Light", false));
				 return 1;		   
			}
			else if(ch.equalsIgnoreCase("Fan")) {
				devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.deviceName.equalsIgnoreCase("Fan"));
				 devices.add(new Fan("Fan", false));
				 return 2;
			}
			else if(ch.equalsIgnoreCase("refrigerator")) {
				devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.deviceName.equalsIgnoreCase("refrigerator"));
				 devices.add(new refrigerator("refrigerator", false));
				 return 2;
			}
			else {
				throw new DeviceNotFound();
			}
		}
		
		}
		
	public void Display() {
		System.out.println("Kitchen devices are:");
		for(Device device:devices) {
			System.out.println(device.toString());
		}

	}
	@Override
	public void controlDevice() {
		System.out.println("Enter Device you want to control:");
		String name = sc.next();
		for(Device device:devices) {
			if(device.deviceName.equalsIgnoreCase(name)) {
		
		
			
			while(true) {
				System.out.println("Do you want to: ");
				System.out.println("1. Turn ON a Device");
				System.out.println("2. Turn OFF a Device");
				System.out.println("3. Control Temperature");
				System.out.println("4.End");
				
				System.out.print("Enter your choice (1 for ON, 2 for OFF): ");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:{
					device.turnOn();
					break;
				}
				case 2:{
					device.turnOff();
					break;
				}
				case 3:{
				device.tempController();
					break;
				
				}
				case 4:{
					return;
				}
				}	
			}
		}
		}
	}
	
	@Override
	public void tempController() {
		System.out.println("Enter Device you want to control:");
		String name = sc.next();
		for(Device device:devices) {
			if(device.deviceName.equalsIgnoreCase(name)) {
				((TemperatureControllerDevices) device).tempController();
			}
		
		}
	}
}

	
	


