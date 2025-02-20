package com.homeAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
	List<Room> rooms=new ArrayList<Room>();
	Room room = new Room();
	Scanner sc = new Scanner(System.in);
	
	
	public void checkStatus() {
		// TODO Auto-generated method stub
		System.out.println("Enter Room Type");
		String type = sc.next();
		room.checkStatus(type);
		
		
	}
	
	
	
	

}
