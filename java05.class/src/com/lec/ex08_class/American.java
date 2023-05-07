package com.lec.ex08_class;

public class American implements Human {

	@Override
	public void speak(String lang) {
		System.out.println(lang + "로 말을 합니다.");
		
	}

	@Override
	public void move() {
		System.out.println("함바그를 만듭니다.");
		
	}

	@Override
	public void think() {
		System.out.println("철학을 논합니다.");
		
	}

}
