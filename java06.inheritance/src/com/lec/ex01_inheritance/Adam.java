package com.lec.ex01_inheritance;

public class Adam extends Human{

	


	@Override
	void move() {
		System.out.println(this.name + "이 사냥을 합니다.");
	}


	@Override
	public String toString() {
		return "Adam [toString()=" + super.toString() + "]";
	}

}
