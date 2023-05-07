package com.lec.ex02_arithmetic;

/*
   산술연산자 (+, -, *, /, %)
   
   산술연산자는 사칙연산과 나머지를 구하는 연산자*%)를 포함해서 총 5개의 연산자가 있다.
   이 연산자는 boolean타입을 제외한 모든 기본 타입에 사용할 수 있다.
   
   산술연산자의 특징은 피연산들의 타입이 동일하지 않을 경우 피연산자들의 타입을 일치시킨 후
   연산을 수행한다. 타입을 일치 시킬 경우에 아래와 같은 규칙을 가지고 수행한다.
   
   1 . 피연산자들이 모두 정수 타입이고 int 타입보다 크기가 작을 경우 모두 int로 형변환한 후에
   	   연산을 수행한다. 따라서 연산의 결과는 int타입이다.
   	   
   	   byte + byte -> int + int = 결과는 int타입이다.
   	   
   2 . 피연산자들이 모두 정수 타입이고 long타입이 있을 경우 모두 long으로 변환후 연산을 수행한다.
   	   따라서, 연산의 결과는 long 타입이다.
   	   
   	   int + long -> long + long = 결과의 타입은 long
   	   
   3 . 피연산자중 실수타입(float, double)이 있을 경우 크기가 큰 실수 타입으로 변환후 연산을 수행
   	   따라서, 연산의 결과는 실수 이다.
   	   
   	   int + double -> double + double = 결과값은 double
   	   
   	   간단하게 정리하면 long을 제외한 정수타입의 연산은 int타입으로 연산되고 피연산중 하나라도
   	   실수타입이 있다면 결과는 실수 타입으로 계산된다.
   	   
   	   정수타입 연산결과가 int타입으로 나오는 이유는 JVM이 기본적으로 32bite(4byte)단위로 연산을
   	   수행하기 때문이다.
   	   
 */
public class ArithmeticOperatorMain {

	public static void main(String[] args) {
		byte byte1 = 1;
		byte byte2 = 1;
		//byte byte3 = byte1 + byte2; // 형변환을 하지 않을 경우에는 에러
		int result = byte1 + byte2;
		System.out.println("result 의 값 = " + result);
		
		int int1 = 10;
		int int2 = 4;
		int result1 = int1 + int2; // 정수타입의 연산은 기본으로 int타입으로 수행된다.
		System.out.println("result1 의 값 = " + result1);
		
		double result2 = int1 / int2;
		System.out.println("result2 의 값 = " + result);
		
		result2 = (int1 / 4.0);
		System.out.println("result2 의 값 = " + result2);
		System.out.println("--------------------------------");
		
		int v1 = 5;
		int v2 = 5;
		result1 = v1 + v2;
		System.out.println("v1 + v2 = " + result1);
		
		result1 = v1 - v2;
		System.out.println("v1 - v2 = " + result1);
		
		result1 = v1 * v2;
		System.out.println("v1 * v2 = " + result1);
		
		result1 = v1 / v2;
		System.out.println("v1 / v2 = " + result1);
		
		result1 = v1 % v2;
		System.out.println("v1 % v2 = " + result1);
		

	}

}
