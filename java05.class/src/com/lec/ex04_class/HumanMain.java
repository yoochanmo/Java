package com.lec.ex04_class;

public class HumanMain {

	public static void main(String[] args) {
		
		// 메서드오버라이딩(2)
		Adam adam = new Adam();
		
		
		System.out.print(adam.name + ", ");
		System.out.print(adam.gender + ", ");
		System.out.println(adam.age);
		adam.speak();
		String msg = adam.move();
		System.out.println(msg);
		System.out.println(adam.toString());
		System.out.println();
		
		Eve eve = new Eve();
		System.out.print(eve.name + ", ");
		System.out.print(eve.gender + ", ");
		System.out.println(eve.age);
		eve.speak();
		msg = eve.move();
		System.out.println(msg);
		System.out.println(eve.xxString());
		System.out.println(eve.toString());
		
	}

}
