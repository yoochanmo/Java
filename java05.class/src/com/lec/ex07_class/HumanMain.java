package com.lec.ex07_class;

public class HumanMain {

	public static void main(String[] args) {
		
		// 추상화 - 추상클래스는 인스턴스화 불가
		// Human human = new Human();
		
		Korean kor = new Korean();
		kor.nation = "대한민국";
		kor.name = "손흥민";
		kor.gender = "남자";
		kor.age = 31;
		kor.speak();
		kor.move();
		kor.think();
		System.out.println(kor.toString());
		System.out.println();
		
		American usa = new American();
		usa.nation = "미국";
		usa.name = "에스더";
		usa.gender = "여자";
		usa.age = 32;
		usa.speak();
		usa.move();
		usa.think();
		System.out.println(usa.toString());
	}

}
