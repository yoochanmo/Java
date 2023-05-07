package com.lec.ex07_polymorphism.pkg2;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver hong = new Driver();
		hong.drive(new Vehicle());
		hong.drive(new Bus());
		hong.drive(new Taxi());
		hong.drive(new Bicyle());
		hong.drive(new 오도방구());
		hong.drive(new 비행기());
		
	

	}

}

class Bicyle extends Vehicle{
	@Override
	void run() {
		System.out.println("자라니입니다.");
	}
}

class 오도방구 extends Vehicle{
	@Override
	void run() {
	System.out.println("오도방구를 탑니다.");
	}
}
class 비행기 extends Vehicle{
	@Override
	void run() {
		System.out.println("비행기를 운전함.");
	}
}