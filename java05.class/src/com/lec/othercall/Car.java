package com.lec.othercall;

public class Car {

	// 1 . 필드
	String company = "포르쉐";
	String model;
	String color;
	int maxSpeed;
	
	// 2 . 생성자
	// this 객체 자기자신을 가리키는 예약어
	// 생성자호출 this() - 시그니처에 맞는 생성자를 호출
	public Car() {
		this(null, null, 0);
	}
	Car(String model){
		this(model, null, 0);
	}
	
	
	public Car(String model, String color) {
		this(model,color,0);
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// 3 . 메서드
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color +",maxSpeed=" +this.maxSpeed+ "]";
	}
}
