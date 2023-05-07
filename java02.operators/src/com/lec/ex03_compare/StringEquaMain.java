package com.lec.ex03_compare;

public class StringEquaMain {

	public static void main(String[] args) {
		// String 타입의 문자열을 비교할 때는 대소문자(>, <, <=, >=)연산자는 사용할 수 없고
		// 동등(==, !=)연산자를 사용할 수 있지만 문자열이 같은지 다른지를 비교하는데는
		// 사용하지 않는다.
		// 그 이유는 String은 기본타입자료형이 아니라 참조타입자료형이기 때문이다.
		// 따라서, String변수를 비교할 경우에는 동등연산자를 사용하면 원하지 않는 결과가
		// 나올 수 있다. 
		
		String str1 = "쏘향"; // literal
		String str2 = "쏘향"; // literal
		String str3 = new String("쏘향"); // 객체
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		
		// 비교연산자를 사용할 경우
		// 참조타입 비교연산시에 동등연산자를 사용할 경우 값을 비교하는 것이 아니라
		// 참조하는 값(주소)를 비교한다.
		System.out.println("str1 == str2 = " + (str1 == str2) ); // true
		System.out.println("str1 == str3 = " + (str1 == str3) ); // false
		System.out.println("str2 == str3 = " + (str2 == str3) ); // false
		
		// 자바는 문자열리터럴이 동일하다면 동일한 String각체를 참조하도록 되어 있다.
		// Java는 리터럴이 동일하다면 Constant Pool에 한개의 값만 생성하도록 되어 있다.
		// 그래서 str1과 str2는 동일한 String객체의 값(주소)를 가지고 있다.
		// 그러나 객체생성연산자인 new로 생성한 str3(참조타입, 객체)는 새로운 객체의
		// 주소값을 가지고 있기 때문에 동등연산자로 비교할 경우에 동등연산자는 객체의
		// 주소를 비교하기 때문에 false라는 결과가 나온다.
		// 따라서, 참조타입인 String(객체)의 값만을 비교할 경우에는 == 연산자대신에
		// Equals() 메서드를 사용해서 비교해야한다.  @#@#@#@#중요@#@#@#@#@#
		System.out.println("str1.equals(str2) => " +str1.equals(str2)); // true
		System.out.println("str1.equals(str3) => " +str1.equals(str3)); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
