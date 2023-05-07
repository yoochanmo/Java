package com.lec.ex02_supercall;

public class People1 {

	String name = "정인";
	String ssn;
		
//	public People1(String ssn) {
//		this.ssn = ssn;
//	}
	
	@Override
	public String toString() {
		return "People1 [name=" + name + ", ssn=" + ssn + "]";
	}
}
		
	class Student1 extends People1 {
		public Student1() {
			super(); // 명시적을 부모의 기본생성자를 호출
		}

		@Override
		public String toString() {
			return "Student1 [name=" + name + "]";
		}
		
		
		
	}
	
	class Student2 extends People1 {
		@Override
		public String toString() {
			return "Student1 [name=" + name + "]";
		}
		
		// 기본생성자가 생략되었어도 컴파일시에 자동으로 기본생성자가 
		// 추가되면서 기본생성자에서 부모클래스의 기본생성자 super();가
		// 호출된다.
	}
		
		
		
		
	
