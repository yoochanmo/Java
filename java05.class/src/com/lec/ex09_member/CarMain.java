package com.lec.ex09_member;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("S500");
		Car car3 = new Car(250);
		Car car4 = new Car("S500",250);
		Car car5 = new Car(250,"S500");
		Car car6 = new Car("S500","핑크",500,200);
		car6.company = "포르쉐";
		System.out.println(car6.toString());
		System.out.println();
	}

}
