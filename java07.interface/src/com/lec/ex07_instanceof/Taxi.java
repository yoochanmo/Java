package com.lec.ex07_instanceof;

public class Taxi implements Vehicle {

	@Override
	public void run() {
System.out.println("택시운행한다..");		
	}
	public void checkNight() {
		System.out.println("야간할증 요금 확인..");
	}
}
