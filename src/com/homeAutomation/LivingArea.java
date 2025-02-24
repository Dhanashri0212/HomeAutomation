package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
	}
	
//	while(true) {
//		System.out.println("1.Turn ON");
//		System.out.println("2.Turn Off");
//		System.out.println("3.Volume Increase");
//		System.out.println("4.Volume Decrease");
//		System.out.println("5.Change Channel");
//		System.out.println("6.Temperature Increase");
//		System.out.println("7.Temperature Decrease");
//		System.out.println("8.Change Song");
//		
//		int ch = sc.nextInt();
//		
//		switch(ch) {
//		case 1:{
//			room.turnOn();
//			break;
//		}
//		case 2:{
//			room.turnOff();
//			break;
//		}
//		case 3:{
//			
//		}
	
}
