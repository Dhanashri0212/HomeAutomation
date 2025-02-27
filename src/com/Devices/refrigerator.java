package com.Devices;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.homeAutomation.KitchenDevice;
import com.homeAutomation.TemperatureControllerDevices;

public class refrigerator extends Device implements KitchenDevice,TemperatureControllerDevices{
	double currentTemperature; // in degree celcius
	Scanner sc = new Scanner(System.in);
	public refrigerator(String deviceName, boolean status, double currentTemperature) {
		super(deviceName, status);
		this.currentTemperature = 4;
	}

	public double getCurrentTemperature() {
		return currentTemperature;
	}
	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	public refrigerator(String deviceName, boolean status) {
		super(deviceName, status);
	}
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void tempController() {
		System.out.println("1.Increase Temperature by 1.");
		System.out.println("2.Decrease Temperature by 1.");
		System.out.println("3 set temperature");
		
		double ch= sc.nextDouble();
		if(Status) {
		if (ch == 1) {
			this.currentTemperature++;
			
        }else if(ch ==2) {
        	this.currentTemperature--;
        }
		else if(ch ==3) {
        	System.out.println("Enter Temperature (Degree Celcius)");
    		double temp= sc.nextDouble();
        	if (temp >= 0 && temp <= 10) {
        		setCurrentTemperature(temp);
                System.out.println("Temperature set to " + temp + "°C.");
            } else {
                System.out.println("Invalid temperature. Set between 0°C to 10°C.");
            }
        }
		else {
            System.out.println("Turn ON the fridge first.");
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
