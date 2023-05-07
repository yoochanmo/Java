package com.lec.ex13_static;

/*
 	정적초기화블럭
 	
 	정적초기화블럭은 클래스가 메모리로 로딩될 때 자동으로 실행되는 블럭이다.
 	정적블럭은 클래스 내부에 여러개 선언도 가능하다.
 	
 	정적블럭은 클래스가 메모리로 로딩될 때 선언된 순서로 실행이 된다.
 */
public class Television {

	static String company = "LG전자";
	static String model = "OLED";
	static String info; // LG전자 - OLED
	int year;
	
	static {
		info = company + "-" + model;
	}
	static {
		// 정적블럭에서는 객체필드에 접근 불가
		// year = 2023; 에라
	}
	static {}
	static {}
	static {}
	
}
