package com.lec.ex06_class;

public class American extends Adam {

	@Override
	void move() {
		System.out.println("햄버거를 만듭니다.");
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	void speak() {
		System.out.println("영어로 말을 합니다.");
	}

}
