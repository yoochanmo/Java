package com.lec.ex06_class;

public class Adam extends Human {

	String gender = "남자";
	@Override
	void move() {
	System.out.println("사냥을 합니다.");
	}

	@Override
	public String toString() {
		return this.name;
	}

}
