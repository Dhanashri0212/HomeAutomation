package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TV extends Device implements EntertainmentDevices {
	double currentVolume = 10;
	double channelNumber = 101;
	double numberOfChannel = 300;

	public TV(String deviceName, boolean status, double currentVolume, double channelNumber, double numberOfChannel) {
		super(deviceName, status);
		this.currentVolume = currentVolume;
		this.channelNumber = channelNumber;
		this.numberOfChannel = numberOfChannel;
	}
	

	public TV(String deviceName, boolean status) {
		super(deviceName, status);
	}


	public double getChannelNumber() {
		return channelNumber;
	}
	
	public void setChannelNumber(double channelNumber) {
		this.channelNumber = channelNumber;
	}
	Scanner sc = new Scanner(System.in);

	public double getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(double currentVolume) {
		this.currentVolume = currentVolume;
	}
	public void volumeIncrease() {
		double num = 0;
		if(Status==true) {
			System.out.println("Increase volume upto");
			double volume = sc.nextDouble();
				num = getCurrentVolume()+volume;
			setCurrentVolume(num);
		}
	}
	
	public void volumeDecrease() {
		double num = 0;
		if(Status ==true) {
			System.out.println("Decrease volume upto");
			double volume = sc.nextDouble();
	
				num = getCurrentVolume()-volume;
			
			setCurrentVolume(num);
		}
	}

	public void changeChannel() {
		while(true) {
		System.out.println("Change Channel By \n1.Forward Channel.\n2.Reverse Channel.\n3.Go to Specific Channel.");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			int ch;
			do {
			double channel = getChannelNumber()+1;
			setChannelNumber(channel);
			System.out.println("You want to Forward Channel Again?\n1.YSE.\n2.No");
			ch = sc.nextInt();	
			}while(ch == 1);
			break;	
		}
		case 2:{
			int ch;
			do {
			double channel = getChannelNumber()-1;
			setChannelNumber(channel);
			System.out.println("You want to Reverse Channel Again?\n1.YSE.\n2.No");
			ch = sc.nextInt();	
			}while(ch == 1);
			break;
		}
		case 3:{
			System.out.println("Enter the Channel Number");
			double channel = sc.nextDouble();
			if(channel>numberOfChannel) {
				setChannelNumber(channel);
			}
			else {
				System.out.println("Channel is not Exiting!!!");
			}
			break;
		}
		case 4:{
			System.out.println("Invalid Choice.");
			return;
		}
		}

		}
	}
	public boolean checkStatus() {
		if(Status == true) {
			return true;
		}
		return false;
		
	}

}
