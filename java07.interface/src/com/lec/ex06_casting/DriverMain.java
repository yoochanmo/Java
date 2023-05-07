package com.lec.ex06_casting;

public class DriverMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus(); // 자동형변환
		vehicle.run();
		//vehicle.checkFare(); // (x)
		
		Bus bus = (Bus) vehicle; // 강제형변환
		bus.run();
		bus.checkFare();
		

	}

}
