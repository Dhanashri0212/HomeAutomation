package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Devices.AC;
import com.Devices.Device;
import com.Devices.Fan;
import com.Devices.Light;
import com.Devices.MusicPlayer;
import com.Devices.TV;
import com.Devices.refrigerator;

public class LivingArea extends Room {

	List<Device> devices = new ArrayList<Device>();
	public LivingArea() {	
	}
	public LivingArea(String roomType) {
		super(roomType);
		devices.add(new Light("Light",false));
		devices.add(new AC("AC",true));
		devices.add(new Fan("Fan",true));
		devices.add(new TV("Tv",false));
		devices.add(new MusicPlayer("MusicPlayer",false));
	}
	Scanner sc = new Scanner(System.in);

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
		for(Device device:devices) {
			System.out.println(device.getDeviceName());
		}
		while(true) {

			System.out.println("Enter Device Name:");
			String ch = sc.nextLine();
			if(ch.equalsIgnoreCase("Light")) {
				 devices.stream().anyMatch(device -> device instanceof LivingRoomDevice && device.getDeviceName().equalsIgnoreCase("Light"));
				 devices.add(new Light("Light", false));
				 return 1;		   
			}
			else if(ch.equalsIgnoreCase("AC")) {
				devices.stream().anyMatch(device -> device instanceof LivingRoomDevice && device.getDeviceName().equalsIgnoreCase("AC"));
				 devices.add(new Fan("AC", false));
				 return 2;
			}
			else if(ch.equalsIgnoreCase("Fan")) {
				devices.stream().anyMatch(device -> device instanceof LivingRoomDevice && device.getDeviceName().equalsIgnoreCase("Fan"));
				 devices.add(new refrigerator("Fan", false));
				 return 3;
			}
			else if(ch.equalsIgnoreCase("TV")) {
				devices.stream().anyMatch(device -> device instanceof LivingRoomDevice && device.getDeviceName().equalsIgnoreCase("TV"));
				 devices.add(new refrigerator("TV", false));
				 return 4;
			}
			else if(ch.equalsIgnoreCase("MusicPlayer")) {
				devices.stream().anyMatch(device -> device instanceof LivingRoomDevice && device.getDeviceName().equalsIgnoreCase("MusicPlayer"));
				 devices.add(new refrigerator("MusicPlayer", false));
				 return 4;
			}
			else {
				throw new DeviceNotFound();
			}
		}
		
		}
		
	public void Display() {
		System.out.println("Living room devices are:");
		for(Device device:devices) {
			System.out.println(device.toString());
		}

	}
	@Override
	public void controlDevice() {
		
				System.out.println("Press 1 for Light");
				System.out.println("Press 2 for Ac");
				System.out.println("Press 3 for fan");
				System.out.println("Press 4 for Tv");
				System.out.println("Press 5 for Music Player");
				System.out.println("Enter Device you want to control:");
				int ch = sc.nextInt();
				
				for(Device device:devices) {
					if(ch == 1&& device.getDeviceName().equalsIgnoreCase("Light")) {
						device.control();
					}
					else if(ch ==2 && device.getDeviceName().equalsIgnoreCase("AC")) {
						device.control();
					}
					else if(ch ==3 && device.getDeviceName().equalsIgnoreCase("Fan")) {
						device.control();
					}
					else if(ch ==4 && device.getDeviceName().equalsIgnoreCase("Tv")) {
						device.control();
					}
					else if(ch ==5 && device.getDeviceName().equalsIgnoreCase("MusicPlayer")) {
						device.control();
					}
					else {
						return;
					}
				}
		}

	public void tempController() {
		System.out.println("Enter Device you want to control:");
		String name = sc.next();
		for(Device device:devices) {
			if(device.getDeviceName().equalsIgnoreCase(name)) {
				((TemperatureControllerDevices) device).tempController();
			}
		
		}
	}

}
