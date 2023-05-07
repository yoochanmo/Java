package com.lec.othercall;

public class CarMain {

	public static void main(String[] args) {
		// this(시그니처...) - 생성자호출방법
		Car car1 = new Car();
		Car car2 = new Car("911카레라");
		Car car3 = new Car("911카레라","분홍");
		Car car4 = new Car("911카레라","파랑",500);

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		System.out.println(car4.toString());
	}

}
