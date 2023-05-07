package com.lec.ex08_class;

// 인터페이스는 상속이라 하지않고 구현한다라는 의미로 implement를 사용
public class Korean implements Human {

	@Override
	public void speak(String lang) {
		System.out.println(lang + "로 말을 합니다.");
		
	}

	@Override
	public void move() {
		System.out.println("기무치를 만듭니다.");
		
	}

	@Override
	public void think() {
		System.out.println("사단칠정론을 논합니다.");
		
	}

}
