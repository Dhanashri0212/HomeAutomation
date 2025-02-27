package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Devices.Device;
import com.Devices.Light;

public class Corridors extends Room {
	List<Device> devices = new ArrayList<Device>();
	Scanner sc = new Scanner(System.in);

	public Corridors(String roomType) {
		super(roomType);
		devices.add(new Light("Light",false));
		
	}
	
	@Override
	public void checkStatus() {
		System.out.println("------------------------------------");
		System.out.println("Device status in " + roomType + ":");
        for (Device device : devices) {
            System.out.println("- " + device.getDeviceName() + " is " + device.getStatus());
        }
        System.out.println("------------------------------------\n");
		
	}

	
	@Override
	public void activeTime() {
		for(Device device:devices) {
			device.activeTime();
		}

	}

	@Override
	
	public int addDevice() throws DeviceNotFound {
		// TODO Auto-generated method stub
		for(Device device:devices) {
			System.out.println(device.getDeviceName());
		}
		System.out.println("Enter Device Name:");
		String ch = sc.nextLine();
		if(ch.equalsIgnoreCase("Light")) {
			 devices.stream().anyMatch(device -> device instanceof KitchenDevice && device.getDeviceName().equalsIgnoreCase("Light"));
			 devices.add(new Light("Light", false));
			 return 1;		   
		}
		else {
			return 0;
		}
	}

	@Override
	public void Display() {
		System.out.println("Kitchen devices are:");
		for(Device device:devices) {
			System.out.println(device.toString());
		}
	}

	@Override
	public void controlDevice() {
		// TODO Auto-generated method stub
		System.out.println("Enter Device you want to control:");
		String name = sc.next();
		for(Device device:devices) {
			if(device.getDeviceName().equalsIgnoreCase(name)) {
					device.control();
			}
		}
	}

}
