package com.lec.ex06_class;

public class HumanMain {

	public static void main(String[] args) {
		// 상속(2)
		Adam adam = new Adam();
		adam.name = "아담";
		System.out.println(adam.gender);
		adam.move();
		adam.speak();
		System.out.println(adam.toString());
		System.out.println();
		
		
		
		
		Eve eve = new Eve();
		eve.name = "이브";
		eve.move();
		eve.speak();
		System.out.println(eve.gender);
		System.out.println(eve.toString());
		System.out.println();
		
		
		Korea kor = new Korea();
		kor.name = "홍길동";
		kor.nation = "대한민국";
		kor.age = 900;
		System.out.println(kor.nation);
		System.out.println(kor.name);
		System.out.println(kor.age);
		kor.speak();
		kor.move();
		System.out.println(kor.toString());
		System.out.println();
		
		
		American usa = new American();
		usa.name = "스티브";
		usa.age = 27;
		System.out.println(usa.name);
		System.out.println(usa.nation);
		System.out.println(usa.age);
		usa.speak();
		usa.move();
		System.out.println(usa.toString());
		System.out.println();
		
		American usa2 = new American();
		usa2.name = "에스더";
		usa2.gender = "여자";
		usa2.nation = "미국";
		System.out.println(usa2.name);
		System.out.println(usa2.nation);
		System.out.println(usa2.age);

	}

}
