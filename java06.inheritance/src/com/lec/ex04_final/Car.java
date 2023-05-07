package com.lec.ex04_final;

public class Car {
	
	public int speed;
	public void speedUp() { speed += 1;}
	public final void stop() {speed = 0;} 
	// final - 자식객체에서 재정의불가 메서드로 지정
	
}


class SuperCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop() {speed = 300;}
	// final로 정의된 부모메서드는 재정의할 수가 없다.
}