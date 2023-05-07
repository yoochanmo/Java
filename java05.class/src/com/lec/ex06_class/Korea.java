package com.lec.ex06_class;

public class Korea extends Adam {

	@Override
	void move() {
		System.out.println("김치를 만듭니다.");
	}

	@Override
	void speak() {
		System.out.println("한국어로 말을 합니다.");
	}

	@Override
	public String toString() {
		return this.name;
	}

	
}
