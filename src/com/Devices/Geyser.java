package com.Devices;

import java.time.LocalTime;
import java.util.Scanner;

import com.homeAutomation.TemperatureControllerDevices;
import com.homeAutomation.WashRoomDevices;

public class Geyser extends Device implements TemperatureControllerDevices,WashRoomDevices {
	double currentTemperature;
	Scanner sc = new Scanner(System.in);
	
	
	public double getCurrentTemperature() {
		return currentTemperature;
	}


	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}


	public boolean checkStatus() {
		if(Status == true) {
			return true;
		}
		return false;	
	}


	@Override
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
        	if (temp >= 50 && temp <= 75) {
        		setCurrentTemperature(temp);
                System.out.println("Temperature set to " + temp + "°C.");
            } else {
                System.out.println("Invalid temperature. Set between 50°C to 75°C.");
            }
        }
		else {
            System.out.println("Turn ON the Geyser first.");
        }
		}
		
	}


	@Override
	public void control() {
		
		
	}
	

}
