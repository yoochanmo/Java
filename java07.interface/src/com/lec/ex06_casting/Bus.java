package com.lec.ex06_casting;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스운전함.");
		
	}
	
	public void checkFare() {
		System.out.println("버스 요금 확인");
	}

}
