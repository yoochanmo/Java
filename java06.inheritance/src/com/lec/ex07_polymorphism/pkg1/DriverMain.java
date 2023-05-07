package com.lec.ex07_polymorphism.pkg1;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver hong = new Driver();
		hong.drive();
		Vehicle vehicle = new Vehicle();
		hong.drive(vehicle);
		hong.drive(new Vehicle());
		hong.drive(new Bus());
		hong.drive(new Taxi());
		
	

	}

}
