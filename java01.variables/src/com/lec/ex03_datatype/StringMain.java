package com.lec.ex03_datatype;

public class StringMain {

	public static void main(String[] args) {
		// 1 . 기본타입 - 정수(byte, short, char, int, long), 실수(float, double), 논리(boolean)
		// 2 . 참조타입 - Class, Array, Interface, Enum
		// String(문자열)은 참조(Reference)타입, 문자열은 String이라는 클라스 타입이다.
		// 자바에서는 클래스로 선언된 것은 모두 참조타입이다.
		// 자바에서 문자열을 표현할 때는 큰 따옴표로 선언한다.
		// 작은 따옴표는 char타입을 선언할 때 사용한다.
		
		char c1 = 'A'; // 기본타입인 정수타입중 하나인 char 타입
		//	char c2 = "A"; 에러 : char 타입은 한개의 문자(내부적으로 유니코드정수값)만 저장할 수 있다.
		String str1 = "A";
		String str2 = "AAA";
		
		// 참조타입은 객체가 저장되어 있는 주소
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("문자열 A가 저장되어 있는 메모리 주소 = " + str1.hashCode());
		System.out.println("문자열 AAA가 저장되어 있는 메모리 주소 = " + str2.hashCode());
		System.out.println("str1이 저장한 값 = " + str1.toString());
		System.out.println("str2이 저장한 값 = " + str2.toString());
		System.out.println();
		
		// literal과 constant의 비교
		// Java에서는 상수의 변수명은 관례로 모두 대문자로 선언, 단어마다 언더바(_) 즉 스네이크방식으로 선언한다.
		// 상수는 final로 선언된 변수를 의미한다. constant값이 한번 설정이 되면 변경할 수 없다.
		final int min_value = 0; // 관례의 위배
		final int MIN_VALUE = 0; // 관례에 따른 상수의 변수명 선언방법
		// min_value = 10; 에러 : 상수(final로 선언된 변수)는 변경할 수 없다.
		final int MAX_VALUE; // 선언만 되고 초기화가 안된 경우
		MAX_VALUE = 100;     // 초기화
		// MAX_VALUE = 10000; 에러
		
		final double PI = 3.141592;
		
		
	}

}
