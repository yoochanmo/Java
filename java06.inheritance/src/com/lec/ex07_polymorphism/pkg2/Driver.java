package com.lec.ex07_polymorphism.pkg2;

public class Driver {

	void drive(Vehicle vehicle) {
		vehicle.run();
		System.out.println(vehicle.getClass());
	}
	

}
