package com.lec.ex02_arithmetic;

public class InfinityNaNCheckMain {

	public static void main(String[] args) {
		// /, % 연산을 수행할 때 주의할 점이 있다.
		// 좌측 피연산자가 정수타입인 경우 나누는 수인 우측 피연산자는 0을 사용할 수 없다.
		// 0으로 나누는 경우 ArithmeticException 예외가 발생한다.
		// 그러나 실수타입인 경우 0.0 or 0.0f로 나누면 예외가 발생되지 않고 나누기연산의
		// 결과 무한대(Infinity)값을 가지고 나머지(%)연산의 결과는 NaN(Not a Number) 결과를
		// 리턴한다.
		
		//System.out.println(5 / 0); ArithmeticException 예외가 발생
		System.out.println(5 / 0.0 ); // Infinity 값을 리턴 
		System.out.println(5 % 0.0 ); // NaN 값을 리턴 
		
		// Java에서는 프로그램에서 / , % 연산의 결과가 Infinity or NaN인지 확인하려면
		// Double.isInfinite(), Double.isNan()메서드를 이용한다.
		// 이 메서드는 리턴값이 Infinity or NaN이면 true를 리턴하고 아니면 false를 리턴한다.
		
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println(Double.isFinite(z1));
		System.out.println(Double.isInfinite(z1));
		System.out.println(Double.isFinite(z2));
		System.out.println(Double.isInfinite(z2));
		System.out.println();
		
		System.out.println(Double.isNaN(z1));
		System.out.println(Double.isNaN(z2));
		System.out.println();
		
		System.out.println("z1 + 2 = " + (z1 + 2));
		System.out.println("z2 + 2 = " + (z2 + 2));
		System.out.println();
		
		if(Double.isInfinite(z1) || Double.isNaN(z2)) {
			System.out.println("계산 못함");
		}else {
			System.out.println("z1 + 2 = " + (z1 + 2));
			System.out.println("z2 + 2 = " + (z2 + 2));
		}
		
		
		
		
		
		
		
		

	}

}
