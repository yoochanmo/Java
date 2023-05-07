package com.lec.ex02_class;

public class HumanMain {

	public static void main(String[] args) {
		// 생성자
		Human h1 = new Human();
		h1.name = "소향";
		h1.gender = "여자";
		h1.age = 44;
		System.out.println(h1.name + "," + h1.gender+ ","+ h1.age );

		Human h2 = new Human("거미");
		h2.name = "거미";
		h2.gender = "여자";
		h2.age = 45;
		System.out.println(h2.name + "," + h2.gender+ ","+ h2.age );
		
		
		Human h3 = new Human("나얼","남자",42);
		System.out.println(h3.name + "," + h3.gender+ ","+ h3.age );
		
		
		// toString() 객체 자신의 정보를 문자열로 리턴하는 메서드
		System.out.println();
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
