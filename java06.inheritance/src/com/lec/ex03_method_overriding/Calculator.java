package com.lec.ex03_method_overriding;

public class Calculator {
	
	double areaCircle(double r) {
		System.out.println("Calculator.areaCircle 메서드 실행");
		return Math.PI * r * r;
	}

}
