package com.lec.ex08_class;

public interface Human {
	
	// 인터페이스에서 선언된 필드(속성) 상수로 정의해야한다.
	// final이 생략
	// 상수는 초기화가 되어야 한다. 그러지 않으면 에러
	// 상수는 대문자로 선언하는것이 관례
	String NATION = "";
	String NAME = "";
	String GENDER = "";
	int AGE = 0;
	
	
	// 인터페이스의 메서드는 전부 추상메서드이다.
	// abstract가 생략, 기본값
	 void speak(String lang);
	 void move();
	 void think();
}
