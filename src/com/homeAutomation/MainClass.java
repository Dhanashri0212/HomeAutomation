package com.homeAutomation;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Home home = new Home();
		
		while(true) {
			System.out.println("Enter Your Choice");
			System.out.println("1.Add device to the room");
			System.out.println("2.Remotly Turn On and Turn Off device");
			System.out.println("3.Check the status of device of each room");
			System.out.println("4.List the total time the device is in the current state.");
			System.out.println("5. work for any devices which may be identified in future as well.");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				
			}
			case 2:{
				
			}
			case 3:{
				home.checkStatus();
			}
			}
			
		}
		

	}

}
