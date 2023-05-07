package com.lec.ex07_polymorphism.pkg1;

public class Driver {

	void drive() {
		System.out.println("차 운전할 수 있어");
	}
	
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	void drive(Bus bus) {
		bus.run();
	}
	
	void drive(Taxi taxi) {
		taxi.run();
	}
}
