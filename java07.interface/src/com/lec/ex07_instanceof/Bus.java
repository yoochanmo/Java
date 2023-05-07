package com.lec.ex07_instanceof;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스 운전한다.");
	}

	public void checkFare() {
		System.out.println("버스요금 확인해라..");
	}
	
}
