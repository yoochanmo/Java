package com.lec.ex12_instance;

public class CarMain {

	public static void main(String[] args) {
		
		// Static (정적, 고정된)
		Car car1 = new Car();
		String com = car1.company;
		System.out.println("회사이름 = " + com);
		System.out.println("모델이름 = " + car1.model);
		System.out.println(car1.toString());
		car1.xxx();
		System.out.println();
		
		System.out.println("회사이름 = " + Car.company);
		Car.xxx();		
		//객체멤버이기 때문에 클래스로 접근불가
//		System.out.println("모델이름 = " + Car.model);
//		System.out.println("모델이름 = " + Car.speed);
	}

}
