package com.lec.ex07_instanceof;

public class Driver {

	void drive(Vehicle vehicle) {
		//vehicle.run();
		//vehicle.checkFare();
		System.out.println(vehicle.getClass());
		if(vehicle instanceof Bus) {
			
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		}else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.run();
			taxi.checkNight();
		}else {
			vehicle.run();
		}
		System.out.println();
	}
	
}
