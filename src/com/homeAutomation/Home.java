package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
	List<Room> rooms=new ArrayList<Room>();
	
	Scanner sc = new Scanner(System.in);
	
	
	public Home() {
		
		rooms.add(new Kitchen("Kitchen"));
		rooms.add(new Bedroom("Bedroom"));
		rooms.add(new Corridors("Corridors"));
		rooms.add(new DiningArea("DiningArea"));
		rooms.add(new LivingArea("LivingArea"));
		rooms.add(new WashRoom("WashRoom"));
	}


	public void checkStatus() {
		// TODO Auto-generated method stub
		System.out.println("Enter Room Type");
		String type = sc.next();
		for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(type)) {
                room.checkStatus();
                return;
            }
        }
	}

	public void turnOn() {
		System.out.println("Enter Room Type");
		String type = sc.next();
		Room room = searchRoom(type);
		if (room == null) {
            System.out.println("Error: Room '" + type + "' not found.");
            return;  // Prevent NullPointerException
        }
		room.turnOn();
	}

	public void turnOff() {
		System.out.println("Enter Room Type");
		String type = sc.next();
		Room room = searchRoom(type);
		if (room == null) {
            System.out.println("Error: Room '" + type + "' not found.");
            return;  // Prevent NullPointerException
        }

		room.turnOff();
	
	}
	public Room searchRoom(String type) {
		
		for (Room room : rooms) {
			if (room.getRoomType().equalsIgnoreCase(type)) {
				return room;
			}
			
		}
		return null;
	
	}
	public void activeTimeStatus() {
		System.out.println("Enter Room Type");
		String type = sc.next();
		Room room = searchRoom(type);
		room.activeTime();
	}


	public int addDevice() {
		
//			System.out.println("1.Press 1 for Kitchen");
//			System.out.println("2.Press 2 for BedRoom");
//			System.out.println("3.Press 3 for Corridor");
//			System.out.println("4.Press 4 for Dinning Area");
//			System.out.println("5.Press 5 for Living Area");
//			System.out.println("6.Press 6 for WashRoom");
//			int ch = sc.nextInt();
		
			System.out.println("Enter Room Type");
			String type = sc.next();
			for (Room room : rooms) {
			
				if(room.getRoomType().equalsIgnoreCase(type)) {
					try {
						return room.addDevice();
					} catch (DeviceNotFound e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}
				
				

		}
			return 0;
	}
	
	public void Displaydevice() {
		System.out.println("Enter Room Type");
		String type = sc.next();
		for (Room room : rooms) {
			if(room.getRoomType().equalsIgnoreCase(type)) {
				room.Display();
			}

	}
	
	
		
	}


	public void controlDevice() {
		System.out.println("Enter Room Type");
		String name = sc.next();
		for (Room room : rooms) {
			if(room.getRoomType().equalsIgnoreCase(name)) {
				room.controlDevice();
				}
		}
	}
	
}
