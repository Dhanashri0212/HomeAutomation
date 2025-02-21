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
		return;

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
		return;
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

}
