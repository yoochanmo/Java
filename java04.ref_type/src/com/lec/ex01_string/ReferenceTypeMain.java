package com.lec.ex01_string;
/*
   1 . 데이터타입분류
   
   	1) 기본타입(premitive type)
   	
   		정수(byte, char,...in, long) 실수(float, double), 논리(boolean)로 실제 값을 가지고 있는 데이터타입
   		
   	2) 참조타입
   	
   		객체가 저장되어 있는 주소를 참조하고 있는 데이터타입으로 Array(배열), Enum(열거), Class(클래스), 대표적
   		(String), Interface(인터페이스)가 있다.
   		
   	3) 기본 vs 참조
   	
   		기본타입은 실제값을 변수에 저장하는 반면에 참조타입은 객체가 저장되어 있는 메모리(힙영역)의 주소를
   		저장하고 있는 데이터타입이다. 주소를 통해 객체를 참조한다는 의미에서 참조타입이라고 한다.
   		
   		자바는 문자열을 String이라는 참조타입(class)변수에 저장하기 때문에 String변수를 우선 선언해야 한다.
   		실세로는 문자열을 String변수에 저장한다는 말은 틀린 말이다. 문자열이 직접 변수에 저장되는 것이 아니라
   		문자열이 String 객체로 생성되어 있는 Heap메모리 영역에 생성되고 String 변수는 String객체가 저장되어 있는
   		힙영역의 메모리주소를 참조한다.
   		
   		자바는 문자열리터럴이 동일하다면 String리터럴을 공유하도록 설계되어 있다. 일반적으로 변수에 문자를 저장할
   		경우에는 문자열 리터럴을 사용하지만 객체 생성연산자인 new를 사용해서 직접 String객체를 생성할 수 있다.
   		
   		new 객체생성연산자는 힙영역에 새로운 객체를 생성할 때 생성하는 연산자로 "객체생성연산자"라고 한다.
   		
   		
   2 . 메모리사용영역
   	
   	1) stack 영역
   	
   		선언된 변수가 저장되는 메모리영역을 말한다.
   		
   		
   	2) Heap 영역
   		
   		힙영역은 객체와 배열이 생성(저장)되는 메모리 영역이다. 힙영역에 생성된 객체와 배열을
   		스택영역의 변수나 다른 객체의 필드에서 참조된다. 참조하는 변수나 필드가 없다면 의미가
   		없는 객체가 되기 때문에 이런 객체를 쓰레기(garbage)로 취급되고 JVM의 쓰레기수집기(garbage collector)를
   		실행 시켜서 객체를 힙영역에서 자동으로 제거한다. JVM이 자동으로 삭제해 주기 때문에 개발자는 별도의 코드를
   		작설할 필요가 없다.
   	
   	3) Method 영역
   
   		코드에서 사용되는 클래스(~.class)들은 클래스로더(class loader)가 읽어서 상수, 필드, 메서드, 생성자들을 구분해서
   		메서드영역에 저장해 둔다. 이 영역은 모든 쓰레드(프로그램)가 공유하는 영역이다.
   		
   	4) Constant Pool
   	
   		리터럴이 저장되는 메모리 영역이다.
   
 */

public class ReferenceTypeMain {

	public static void main(String[] args) {
		
		String str = new String();
		ReferenceTypeMain myclass = new ReferenceTypeMain(); // 참조타입
		
		String str1 = new String("홍길동");  // 객체 - 힙영역
		String str2 = "홍길동"; 		     // 리터럴 - C.P 영역
		String str3 = "홍길동"; 			 // 리터럴 = C.P 영역(여기에서 홍길동이라는 리터럴은 str2와 동일값)
		String str4 = new String("홍길동");  // 객체 - 힙영역
		str4 = null;
		
		int i1 = 10;
		String name1 = "쏘향";
		String name2 = "쏘향";
		String name3 = new String("쏘향");
		String name4 = new String("쏘향");
		
		// 동등연산자(==, !=)
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println();
		
		// 값만 비교할 경우 equals()
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println();
		
		// 객체의 메모리주소 확인하기 hashCode()
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		System.out.println();
		
		
		ReferenceTypeMain rt1 = new ReferenceTypeMain();
		ReferenceTypeMain rt2 = new ReferenceTypeMain();
		System.out.println(rt1.hashCode());
		System.out.println(rt2.hashCode());
		System.out.println();
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
	}

}
