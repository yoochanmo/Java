package com.lec.ex03_method_overriding;

public class ComputerMain {

	public static void main(String[] args) {
		int radius = 10;
		System.out.println(Math.PI);
		System.out.println();
		
		Calculator calculator = new Calculator();
		System.out.println("원의 면적 = " + calculator.areaCircle(radius));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원의 면적 = " + computer.areaCircle(radius));
		System.out.println();
	}

}
