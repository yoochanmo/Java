package com.lec.ex06_change.typechange;
/*
 	타입변환과 다형성
 	
 	다형성이란 ? 동일타입이지만 실행결과가 다양한 형태의 객체를 이용할 수 있는 성질을 말한다.
 	프로그램측면에서 보면 다형성의 하나의 타입에 여러형태의 객체를 대입함으로써 다양한 기능을
 	수행할 수 있게 한다.
 	
 	다형성을 위해서 Java는 자식클래스가 부모클래스로 타입변환을 허용한다. 즉, 부모타입에 모든
 	자식객체들을 대입할 수 있다는 것이다. 이 기능을 이용한다면 모든 객체는 부품화가 가능해진다.
 	
 	타입변환이란? 데이터타입을 다른 데이터타입으로 변환하는 행위를 말한다. 기본 데이터타입의 변환처럼
 	참조타입(class, array, interface, enum)도 타입변환이 가능하다. 클래스타입변환은 직접적인 상속관계가 있는
 	클래스사이에서만 타입변환이 가능하다.
 	
 	자동타입변환(promotion)d은 프로그램실행 도중에 자동적으로 타입변환이 일어나는 것을 말한다.
 	자동타입변환 개념은 자식이 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급될 수 있다는
 	것이다.
 	
 	주의할 점은 자동타입변환이 된 후에는 부모클래스에 선언된 필드와 메서드만 접근이 가능하다.
 	비록 변수는 자식객체를 참조하지만 변수로 접근 가능한 멤버는 부모클래스의 멤버로만 제한된다.
 	그러나 예외가 있는데 메서드가 자식클래스에서 오버라이딩이 되었다면 부모클래스의 메서드가
 	호출되는 것이 아니라 자식클래스의 메서드가 호출된다.
 	
 */

public class PromotionMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동형변환
		// 1 . 직접상속관계가 있을 경우 - 가능
//		a = b;
//		a = c;
//		a = d;
//		a = e;
//		
//		b = d;
//		c = e;
		
		// 2 . 직접상속관계가 없을 경우 - 불가능
		// b = e;( x )
		// c = d;( x )
		
		
		
		// 3 . 메서드의 매개변수로 전달
		method_a(1);
		method_a("참조타입");
		
		method_a(a);
		method_a(b);
		method_a(c);
		method_a(d);
		method_a(e);
		System.out.println();
		
		method_b(b);
		//method_b(c);
		method_b(d);
		//method_b(e);
	}
	
	static void method_a(double a) {System.out.println("정수형 = " + a);}
	static void method_a(String a) {System.out.println("참조타입(문자열) = " + a.getClass());}
	static void method_a(A a) {System.out.println("A = " + a.getClass());}
	static void method_b(B b) {System.out.println("B = " + b.getClass());}
	

}
