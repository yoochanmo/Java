package com.lec.ex01_class;
/*
 	클래스
 	
 	1 . 클래스의 명명규칙
 	
 		1) 하나 이상의 문자로 이루어 져야 한다. 단, 첫글자는 대문자로 시작해야 하고
 			한글이름도 가능하지만 관례적으로 영문이름으로 정의한다.
 			
 		2) 첫번째는 숫자가 올 수 없다.
 		
 		3) $, _ 이외에 특수문자는 사용할 수 없다.
 		
 		4) Java 예약어는 사용할 수 없다.
 		
 	2 . 클래스를 선언하는 키워드 class는 반드시 소문자로 작성해야 한다.
 	
 	3 . 일반적으로 소스파일 하나당 한 개의 클래스를 정의한다. 하지만 여러개의 클래스도
 		선언이 가능하다. 다만 클래스당 한 개의 ~.class파일 각각 생성된다.
 		다만, public(접근제한자)은 소스파일명과 동일한 클래스에만 선언할 수 있다.
 		
 	4 . 소스파일명과 class명은 동일해야 한다.
 */
public class Human {

	// 1 . 속성
	
		String name;
		String gender;
		int age;
		String ssn;
		
		
		
	// 2 . 생성자 : class 이름과 동일해야 한다.
		Human() {} // 기본생성자
		Human(String name) {}

	// 3 . 메서드
	void think() {System.out.println("생각한다");}
	void eat() {System.out.println("먹는다");}
	void speak() {System.out.println("말을한다");}
	void move() {System.out.println("움직인다");}
	
	
}

class Car{}
class House{}
