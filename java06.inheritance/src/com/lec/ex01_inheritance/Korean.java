package com.lec.ex01_inheritance;

public class Korean extends Adam  {

	@Override
	public String toString() {
		return "Korean [toString()=" + super.toString() + "]";
	}

	@Override
	void speak() {
		//super.speak(); super는 최종 Human.speak()
		System.out.println("한국어로 말을 합니다.");
		
	}
	@Override
	void move() {
		System.out.println("프로그램을 개발합니다.");
		
	}
}
