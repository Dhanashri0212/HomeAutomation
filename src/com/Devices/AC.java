package com.Devices;

import java.util.Scanner;

import com.homeAutomation.BedroomDevice;
import com.homeAutomation.LivingRoomDevice;
import com.homeAutomation.TemperatureControllerDevices;

public class AC extends Device implements LivingRoomDevice,BedroomDevice,TemperatureControllerDevices{
	double currentTemperature;
	Scanner sc = new Scanner(System.in);
	public AC(String deviceType) {
		super(deviceType);	
	}
	public double getCurrentTemperature() {
		return currentTemperature;
	}
	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = 23;
	}
	public AC(String deviceName, boolean status) {
		super(deviceName, status);
	}

	@Override
	public void tempController() {
		System.out.println("1.Increase Temperature by 1.");
		System.out.println("2.Decrease Temperature by 1.");
		System.out.println("3.Set Temperature.");
		
		double ch= sc.nextDouble();
		if(Status) {
		if (ch == 1) {
			double temp=this.currentTemperature++;
			 System.out.println("Current Temperature of AC is " + temp + "°C.");
			
        }else if(ch ==2) {
        	double temp =this.currentTemperature--;
        	System.out.println("Current Temperature of AC is " + temp + "°C.");
        }
		else if(ch ==3) {
        	System.out.println("Enter Temperature in °C.");
    		double temp= sc.nextDouble();
        	if (temp >= 16 && temp <= 55) {
        		setCurrentTemperature(temp);
        		
                System.out.println("Temperature set to " + temp + "°C.");
            } else {
                System.out.println("Invalid temperature. Set between 0°C to 10°C.");
            }
        }
		else {
            System.out.println("Turn ON the AC first.");
        }
		}
		
	}
	@Override
	public void control() {
		while(true) {
			System.out.println("Do you want to: ");
			System.out.println("1. Turn ON a Device");
			System.out.println("2. Turn OFF a Device");
			System.out.println("3. Control Temperatue");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:{
				turnOn();
				break;
			}
			case 2:{
				turnOff();
				break;
			}
			case 3:{
				tempController();
			}
			}
		}
		
	}

	

}
