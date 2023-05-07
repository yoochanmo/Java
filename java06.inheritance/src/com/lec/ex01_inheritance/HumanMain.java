package com.lec.ex01_inheritance;

public class HumanMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		System.out.println(human.toString());
		human.speak();
		human.eat();
		human.move();
		System.out.println();

		Adam adam = new Adam();
		adam.name = "아담";
		adam.gender = "남자";
		adam.age = 10000;
		System.out.println(adam.toString());
		adam.speak();
		adam.eat();
		adam.move();
		System.out.println();
		Eve eve = new Eve();
		eve.name = "이브";
		eve.gender = "여자";
		eve.age = 9000;
		System.out.println(eve.toString());
		eve.speak();
		eve.eat();
		eve.move();
		eve.makeBaby();
		System.out.println();
		
		Korean hong = new Korean();
		hong.name = "홍길동";
		hong.gender = "남자";
		hong.age = 85000;
		System.out.println(hong.toString());
		hong.speak();
		hong.eat();
		hong.move();
		System.out.println();
		
		American usa = new American();
		usa.name = "에스더";
		usa.gender = "여자";
		usa.age = 230000;
		System.out.println(usa.toString());
		usa.speak();
		usa.eat();
		usa.move();
		usa.makeBaby();
		System.out.println();
		
	}

}
