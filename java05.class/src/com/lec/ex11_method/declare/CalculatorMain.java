package com.lec.ex11_method.declare;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// Calculator 객체를 생성하고 add ~ div까지 구현
		Calculator cal1 = new Calculator();
		cal1.powerOn();
		int result1 = cal1.add1(10, 20);
		int result2 = cal1.sub(20, 10);
		int result3 = cal1.mul(10, 10);
		int result4 = cal1.div(10, 3);
		
		System.out.println("add =" +result1);
		System.out.println("sub =" +result2);
		System.out.println("mul =" +result3);
		System.out.println("div =" +result4);
		cal1.powerOff();
		
		String result5 = cal1.xxx();
		System.out.println("xxx = " + result5);
		
		String result6 = cal1.yyy();
		System.out.println("yyy = " + result6);
		
		
		Calculator result7 = cal1.zzz();
		System.out.println("result7.add() = "+ result7.add1(4156, 6848));
		System.out.println("result7.mul() = "+ result7.mul(4156, 6848));
		
		
		
		
		
		
		
}
}