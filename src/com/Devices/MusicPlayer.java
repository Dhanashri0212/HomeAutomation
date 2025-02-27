package com.Devices;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.homeAutomation.EntertainmentDevices;

public class MusicPlayer extends Device implements EntertainmentDevices{
	double currentVolume;
	 List<String> playlist;
	 int currentSongIndex;

	
	
	public MusicPlayer(String deviceName, boolean status) {
		super(deviceName, status);
	}

	public List<String> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<String> playlist) {
		this.playlist = playlist;
	}

	public int getCurrentSongIndex() {
		return currentSongIndex;
	}

	public void setCurrentSongIndex(int currentSongIndex) {
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
		if(Status==true) {
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
		if(Status==true) {
			System.out.println("Decrease volume upto");
			double volume = sc.nextDouble();
			for(double i = getCurrentVolume(); i>=volume;i--) {
				num = getCurrentVolume()+i;
			}
			setCurrentVolume(num);
		}
	}
//	public void changeSong() {
//		while(true) {
//			System.out.println("Change Song By \n1.Forward song.\n2.Reverse song.\n3.Go to Specific song.");
//			int choice = sc.nextInt();
//			switch(choice) {
//			case 1:{
//				int index = 0;
//				
//					if(currentSongIndex<playlist.size()) {
//					index =currentSongIndex++;
//					}
//					else {
//						System.out.println("No song in playlist");
//					}
//				}
//				setCurrentVolume(index);
//				break;
//				
//			}
//			case 2:{
//				int ch;
//				do {
//				double channel = ()-1;
//				setChannelNumber(channel);
//				System.out.println("You want to Reverse Channel Again?\n1.YSE.\n2.No");
//				ch = sc.nextInt();	
//				}while(ch == 1);
//				break;
//			}
//			case 3:{
//				System.out.println("Enter the Channel Number");
//				double channel = sc.nextDouble();
//				if(channel>numberOfChannel) {
//					setChannelNumber(channel);
//				}
//				else {
//					System.out.println("Channel is not Exiting!!!");
//				}
//				break;
//			}
//			case 4:{
//				System.out.println("Invalid Choice.");
//				return;
//			}
//			
//			}
//				
//			
//			}
//		}
//	
public boolean checkStatus() {
	if(Status == true) {
		return true;
	}
	return false;
	
}

@Override
public void control() {
	
}
	



}
