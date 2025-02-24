package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class refrigerator extends Device implements KitchenDevice{
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
		System.out.println("2.Set Temperature.");
		
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
	

}
