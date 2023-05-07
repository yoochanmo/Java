package com.lec.ex09_instance;
/*
 	객체타입확인연산자(instanceof)
 	
 	강제타입변환은 자식객체에서 부모객체로 타입변환이 되어 있는 상태에서만 가능하기 때문에
 	부모타입의 변수가 부모객체를 참조할 경우 자식타입으로 변환할 수가 있다.
 	예를 들어
 	
 	Parent parent = new Parent();
 	Child child = (Child)parent; <- 강제형변환불가, ClassCastException 발생
 	
 	instanceof연산자는 좌측항은 객체가 오고 우측항은 타입이 오는데 좌측항의 객체가 우측항의
 	인스턴스(객체)가 아니면 false, 우측항의 타입으로 생성된 인스턴스(객체)라면 true를 리턴
 	
 	boolean result = 객체 instanceof 참조타입
 	
 	instanceof연산자는 매개값의 타입을 조사할 때 주로 사용한다. 메서드내에서 강제타입변환이
 	팔요한 경우 반드시 매개값이 어떤 타입인지를 instanceof연산자로 확인하고 안전하게 강제타입변환을
 	해야 한다.
 	
 	만약 타입을 확인하지 않고 강제타입변환을 시도할 경우에 강제타입변환이 되지 않을 경우에는
 	ClassCastException예외가 발생한다.
 	
 	 */
public class InstanceOfMain {

	public static void main(String[] args) {
		// 강제형변환불가
//		Parent parent = new Parent();
//		Child child = (Child)parent;
		
		Parent parentA = new Child(); // 자동형변환
		method1(parentA);
		method2(parentA);
		System.out.println();
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);

	}


	private static void method1(Parent instance) {
		System.out.println(instance.getClass());
		if(instance instanceof Child) {
			Child child = (Child)instance;
			System.out.println("method1() - 강제형변환 성공");
		}else {
			System.out.println("method1() - 강제형변환 실패");
		}
		
	}
	private static void method2(Parent instance) {
		System.out.println(instance.getClass());
		Child child = (Child)instance;
		System.out.println("method1() - 강제형변환 성공");
	}

}




















