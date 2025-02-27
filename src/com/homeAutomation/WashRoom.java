package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Devices.Device;
import com.Devices.Fan;
import com.Devices.Light;
import com.Devices.refrigerator;

public class WashRoom extends Room {

	List<Device> devices = new ArrayList<Device>();
	
	Scanner sc = new Scanner(System.in);
	public WashRoom(String roomType) {
		super(roomType);
		devices.add(new Light("Light",false));
		devices.add(new Light("Geyser",false));
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
		for(Device device:devices) {
			System.out.println(device.getDeviceName());
		}
		while(true) {
			System.out.println("Enter Device Name:");
			String ch = sc.nextLine();
			if(ch.equalsIgnoreCase("Light")) {
				 devices.stream().anyMatch(device -> device instanceof BedroomDevice && device.getDeviceName().equalsIgnoreCase("Light"));
				 devices.add(new Light("Light", false));
				 return 1;		   
			}
			else if(ch.equalsIgnoreCase("Geyser")) {
				devices.stream().anyMatch(device -> device instanceof BedroomDevice && device.getDeviceName().equalsIgnoreCase("Geyser"));
				 devices.add(new Fan("Fan", false));
				 return 2;
			}
			else {
				throw new DeviceNotFound();
			}
		}
	}
	@Override
	protected void Display() {
		System.out.println("Bed room devices are:");
		for(Device device:devices) {
			System.out.println(device.toString());
		}
		
	}
	@Override
	public void controlDevice() {
		System.out.println("Press 1 for Light");
		System.out.println("Press 2 for Geyser");
		System.out.println("Exit");
		System.out.println("Enter Device you want to control:");
		int ch = sc.nextInt();
		
		for(Device device:devices) {
			if(ch == 1&& device.getDeviceName().equalsIgnoreCase("Light")) {
				device.control();
			}
			else if(ch ==2 && device.getDeviceName().equalsIgnoreCase("Geyser")) {
				device.control();
			}
			else {
				return;
			}
			
		}
	}
}
		
	
	
	


