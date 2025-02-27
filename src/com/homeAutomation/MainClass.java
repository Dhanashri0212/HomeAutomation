package com.homeAutomation;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Home home = new Home();
		System.out.println("WELCOME TO HOME AUTOMATION SYSTEM !!!!\n");
		
		while(true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.Add device ");
			System.out.println("2.Control Device");
			System.out.println("3.Check Status of Device");
			System.out.println("4.Active Time of Devices.");
			System.out.println("5.Display all Devices");
			System.out.println("6. work for any devices which may be identified in future as well.");
			System.out.println("Enter Your Choice");
			System.out.println("-----------------------------------------------------------------------\n");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				
				int result =home.addDevice();
				if(result != 0) {
					System.out.println("Device Added Successfully!!!");
				}
				break;	
			}
			case 2:{
				home.controlDevice();
				break;
			}
			case 3:{
				home.checkStatus();
				break;
			}
			case 4:{
				home.activeTimeStatus();
				break;
			}
			case 5:{
				home.Displaydevice();
				break;
			}
			}
			
		}
		

	}

}
