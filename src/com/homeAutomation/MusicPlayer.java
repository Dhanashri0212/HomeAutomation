package com.homeAutomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer extends Device implements EntertainmentDevices{
	double currentVolume;
	 List<String> playlist;
	 int currentSongIndex;

	
	public MusicPlayer(String deviceType, boolean powerStatus, LocalTime onTime, LocalTime offTime,
			double currentVolume, List<String> playlist, int currentSongIndex) {
		super(deviceType, powerStatus, onTime, offTime);
		this.currentVolume = currentVolume;
		this.playlist = playlist;
		this.currentSongIndex = currentSongIndex;
	}

	public MusicPlayer() {
		 this.playlist = new ArrayList<>();
	        this.currentSongIndex = 0;

	        // Adding sample songs
	        playlist.add("Shape of You");
	        playlist.add("Blinding Lights");
	        playlist.add("Believer");
	        playlist.add("Senorita");
	        playlist.add("Someone Like You");
	        playlist.add("Cheap Thrills");
	        playlist.add("Perfect");
	        playlist.add("Memories");
	        playlist.add("Photograph");
	        playlist.add("Levitating");

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
		if(powerStatus==true) {
			System.out.println("Increase volume upto");
			double volume = sc.nextDouble();
			for(double i = getCurrentVolume(); i<=volume;i++) {
				num = getCurrentVolume()+i;
			}
			setCurrentVolume(num);
		}
	}
	
	public void volumeDecrease() {
		double num = 0;
		if(powerStatus==true) {
			System.out.println("Decrease volume upto");
			double volume = sc.nextDouble();
			for(double i = getCurrentVolume(); i>=volume;i--) {
				num = getCurrentVolume()+i;
			}
			setCurrentVolume(num);
		}
	}
	public void changeSong() {
		while(true) {
			System.out.println("Change Channel By \n1.Forward song.\n2.Reverse song.\n3.Go to Specific song.");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
				int index = 0;
				for(int i =currentSongIndex+1; i< playlist.size();i++) {
					if(i<playlist.size()) {
					index =currentSongIndex++;
					}
					else {
						System.out.println("No song in playlist");
					}
				}
				setCurrent(index);
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
	if(powerStatus == true) {
		return true;
	}
	return false;
	
}
	



}
