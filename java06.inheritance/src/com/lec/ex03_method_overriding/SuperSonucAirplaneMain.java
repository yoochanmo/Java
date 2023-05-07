package com.lec.ex03_method_overriding;

public class SuperSonucAirplaneMain {

	public static void main(String[] args) {
		
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeoff();
		
		sa.fly();
		sa.flymod = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymod = SuperSonicAirplane.NORMAL;
		
		sa.fly();
		sa.land();

	}

}
