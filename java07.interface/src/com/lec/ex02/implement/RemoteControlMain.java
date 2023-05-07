package com.lec.ex02.implement;

public class RemoteControlMain {

	public static void main(String[] args) {
		
//	 Television tv = new Television();
//	 Audio audio = new Audio();
	
	RemoteControl rc;
	rc = new Television(); // Tv Button click
	rc.turnOn();
	rc.setVolumn(5);
	rc.setMute(true);
	rc.turnOff();
	System.out.println();
	
	rc = new Audio(); // Audio button click
	rc.turnOn();
	rc.setVolumn(20);
	rc.setMute(true);
	rc.turnOff();
	
	// 건전지교환 - static 메서드
	RemoteControl.changeBattery();
	
	
	
	
	
	
	}

}
