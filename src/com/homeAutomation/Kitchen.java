package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Devices.Device;
import com.Devices.Fan;
import com.Devices.Light;
import com.Devices.refrigerator;

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
		System.out.println("Enter Device name to Trun On");
		String name = sc.next();
		for(Device device:devices) {
			if(device.getDeviceName().equalsIgnoreCase(name)) {
				device.turnOn();
			}
		}
	}
	public void turnOff() {
		System.out.println("Enter Device name to Trun Off");
		String name = sc.next();
		for(Device device:devices) {
			if(device.getDeviceName().equalsIgnoreCase(name)) {
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
		System.out.println("Press 1 for Light");
		System.out.println("Press 2 for refrigerator");
		System.out.println("Press 3 for fan");
		
		
			System.out.println("Enter Device Name:");
			int ch = sc.nextInt();
			if(ch == 1 ) {
				 devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.getDeviceName().equalsIgnoreCase("Light"));
				 devices.add(new Light("Light", false));
				 return 1;		   
			}
			else if(ch == 2 ) {
				devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.getDeviceName().equalsIgnoreCase("refrigerator"));
				 devices.add(new refrigerator("refrigerator", false));
				 return 2;
			}
			else if(ch ==3) {
				devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.getDeviceName().equalsIgnoreCase("Fan"));
				 devices.add(new Fan("Fan", false));
				 return 3;
			}
			else {
				throw new DeviceNotFound();
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
		System.out.println("Press 1 for Light");
		System.out.println("Press 2 for refrigerator");
		System.out.println("Press 3 for fan");
		System.out.println("Enter Device you want to control:");
		int ch = sc.nextInt();
		
		for(Device device:devices) {
			if(ch == 1 && device.getDeviceName().equalsIgnoreCase("Light")) {
				device.control();
			}
			else if(ch ==2 && device.getDeviceName().equalsIgnoreCase("refrigerator")) {
				device.control();
			}
			else if(ch ==3 && device.getDeviceName().equalsIgnoreCase("fan")) {
				device.control();
			}
			else {
				return;
			}
		}
	}
	
	@Override
	public void tempController() {
		System.out.println("Press 1 for Light");
		System.out.println("Press 2 for refrigerator");
		System.out.println("Press 3 for fan");
		System.out.println("Enter Device you want to control:");
		String name = sc.next();
		for(Device device:devices) {
			if(device.getDeviceName().equalsIgnoreCase(name)) {
				((TemperatureControllerDevices) device).tempController();
		}
	}
}
}

	
	


