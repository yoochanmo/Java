package com.lec.ex05_class;

public class HumanMain {

	public static void main(String[] args) {
		
		
		// 상속(1)
		Human human = new Human();
		System.out.println(human.nation);
		System.out.println(human.name);
		System.out.println(human.gender);
		System.out.println(human.age);
		human.speak();
		human.move();
		System.out.println();
		
		Adam adam = new Adam();
		adam.name = "아담";
		adam.age = 10000;
		adam.gender = "남자";
		System.out.println(adam.nation);
		System.out.println(adam.name);
		System.out.println(adam.gender);
		System.out.println(adam.age);
		adam.speak();
		adam.move();
		System.out.println(adam.toString());
		System.out.println();
		
		Eve eve = new Eve();
		eve.name = "이브";
		eve.gender = "여자";
		eve.age = 9000;
		System.out.println(eve.nation);
		System.out.println(eve.name);
		System.out.println(eve.gender);
		System.out.println(eve.age);
		eve.speak();
		eve.move();
	    System.out.println(eve.job);
	    eve.makeBaby();
		System.out.println(eve.toString());
		
		
		
	}

}
