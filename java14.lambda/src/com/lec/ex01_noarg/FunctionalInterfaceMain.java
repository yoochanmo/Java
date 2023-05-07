package com.lec.ex01_noarg;

/*
 	람다식(Lambda Expression)
 	
 	자바는 함수형 프로그래밍을 위해 Java8버전부터 람다식을 지원하면서 기존의 코딩 패턴이 많이 달라 졌다.
 	람다식은 수학자 알론조 처치(Alonzo Church)가 발표한 계산법에서 사용된 수학식의 표현으로 이를 제자인
 	존 메카시 (Jhon McCarthy)가 프로그래밍언어에 도입했다.
 	
 	람다식은 익명함수를 생성하기 위한 식으로 객체지형언어보다 함수지향언어에 가깝다. 자바에 람다식을 수용한
 	이유가 자바코드가 매우 간결해지고 컬렉션의 요소를 필요하거나 매핑에서 원하는 결과를 쉽게 집계할 수가 있기
 	때문이다. 람다식의 형태는 매개변수를 가진 코드블럭이지만 런타임시에는 익명구현객체를 생성한다.
 	
 	1 . 기본문법
 	(매개변수   arg...) -> {실행문 . . . .}
 	
 	람다식에서는 런타임시에 대입되는 값에 따라 자동으로 인식될 수 있기 때문에 람다식에서는 매개변수의 타입을
 	일반적으로 정의하지 않는다. 예를 들어 매개변수가 하나가 있을 경우에는 아래와 같이 정의할 수 있다.
 	
 	(int a) -> {System.out.println(a);}
 	or  a -> {System.out.println(a);} : 소괄호가 없는 경우는 매개변수나 하나만 있을 경우에만 생략가능
 	or  a -> System.out.println(a);	  : 중괄호가 없는 경우는 실행문장이 하나만 있을 경우에만 생략가능
 	
 	2 . 타겟함수와 함수적인터페이스
 		
 		람다식형태는 매개변수를 가진 코드블럭이기 때문에 자바의 메서드를 선언하는 것 처럼 보여지지만 자바는
 		메서드를 단독으로 사용할 수 없고 항상 클래스의 멤버로 선언하기 때문에 람다식은 단순히 메서드를 선언
 		하는 것이 아니라 객체(익명)을 생성한다.
 		
 		람다식은 인터페이스 변수에 대입된다. 이 의미는 "람다식은 익명구현객체를 생성한다."라는 의미이다.
 		인터페이스는 직접 객체생성할 수 없기 때문에 구현클래스가 필요한데 람다식은 구현하는 클래스 선언없이
 		직접 익명구현객체를 생성해서 객체화(인스턴스화)할 수 있다.
 		
 		람다식은 대입될 인터페이스의 종류에 따라 달라지기 때문에 람다식이 대입될 인터페이스를 람다식의 타겟
 		타입(Target Type)이라고 한다.
 	
 	
 	
 	 3 . 함수적인터페이스(Functional Interface)
 		
 		모든 인터페이스를 람다식의 타겟타입으로 사용할 수 없다. 람다식이 하나의 메서드만 정의하기 때문에 두 개 이상의
 		추상메서드가 선언된 인터페이스는 람다식으로 사용할 수 없다.
 		
 		하나의 추상메서드가 선언된 인터페이스만이 람다식의 타겟타입이 될 수 있는데 이러한 인터페이스를
 		"함수적 인터페이스 Functional Interface"라고 한다. 함수적인터페이스를 작성할 때 2개 이상의 
 		추상메서드가 선언되지 않도록 컴파일러가 확인할 수 있도록 하기 위해서는 명시적으로 @FunctionalInterface에너테이션을
 		해야한다.
 	
 	
 */
public class FunctionalInterfaceMain {

	public static void main(String[] args) {
	
		
		// 타겟타입과 구현객체
		MyFuncInterface xxx = new XXX();
		xxx.method();
		
		// 타겟타입과 익명객체
		Runnable yyy = new Runnable() {
			@Override
			public void run() {}
		};
				
		// 인터페이스는 객체 생성 불가능
		// MyFuncInterface aaa = new MyFuncInterface();
			
	
		// 익명 구현 객체
		MyFuncInterface zzz = new MyFuncInterface() {
			@Override
			public void method() {}

			@Override
			public void methodA() {
				// TODO Auto-generated method stub
				
			}
		};
		
		// 람다식 
		MyFuncInterface1 fi1 = new MyFuncInterface1() {
			@Override
			public void method() {
				System.out.println("fi1 = Functional Interface의 추상메서드를 구현했습니다.(익명구현객체)");
			}
		};
		fi1.method();
		
		MyFuncInterface1 fi2 = () -> {System.out.println("fi2 = Functional Interface의 추상메서드를 구현했습니다.(익명구현객체)");};
		fi2.method();
			
		MyFuncInterface1 fi3 = () -> System.out.println("fi3 = Functional Interface의 추상메서드를 구현했습니다.(익명구현객체)");;
		fi3.method();
		
	}

}
@FunctionalInterface
interface MyFuncInterface1{
	void method();
}




//@FunctionalInterface : 추상메서드가 한개가 아니기 때문에 Functional Interface로 선언할 수 없다.
interface MyFuncInterface{
	void method();
	void methodA();
}

class XXX implements MyFuncInterface{

	@Override
	public void method() {}

	@Override
	public void methodA() {}
	
}

























