package com.lec.ex03_compare;

public class CompareOperatorMain1 {

	public static void main(String[] args) {
		// 비교연산자 : <, >, <=, >=, !=
		int num1 = 10;
		int num2 = 10;

		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 <= num2;
		
		System.out.println("num1 == num2의 결과는 " + result1);
		System.out.println("num1 != num2의 결과는 " + result2);
		System.out.println("num1 <= num2의 결과는 " + result3);
		System.out.println();
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1 < char2;
		System.out.println("char1 < char2의 결과는 " + result4);
		System.out.println();
		
		// 비교연산시에도 연산을 수행하기 전에 형변환이 발생되어서
		// 피연산자의 타입을 일치 시킨다.
		System.out.println('A' == 65); // true
		System.out.println(3 == 3.0); // true
		System.out.println(0.1 == 0.1f); // false 따블과 플롯 비교 주의
		// 이진포맷기수를 사용하는 모든 부동소수점타입은 0.1을 정확히 표현할 수가
		// 없기 때문에 true가 아니라 false가 결과값으로 산출된다.
		// 0.1f를 double로 형변환을 하면 실제값은 0.10000000149011612이 된다.
		System.out.println();
		
		
		System.out.println(0.1f);
		System.out.println((double)0.1f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
