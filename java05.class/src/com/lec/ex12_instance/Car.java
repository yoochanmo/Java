package com.lec.ex12_instance;

/*
  	클래스(.~class 파일)멤버 vs 인스턴스(객체)멤버
  	
  	1 . 클래스멤버 : 클래스관점에서 정의된 필드, 생성자,메서드
  	2 . 인스턴스멤버 : 객체(인스턴스)관점에서 본 필드, 메서드
  	
  		클래스(~.class)멤버는 객체멤버가 아니기 때문에 객체생성없이도
  		사용할 수 있지만 객체멤버는 반드시 객체가 생성된 후에 사용할 수 있다.
  		
  	
 */

public class Car {
	static String company = "포르쉐"; //클래스(정적)멤버
	String model;					 // 객체멤버
	int speed;						 // 객체멤버
	
	@Override
	public String toString() {
		return this.company + " ," + this.model + ", " + this.speed;
	}

	public static  void xxx() {
	 System.out.println("static method 호출!!");
		
	}
	
}
