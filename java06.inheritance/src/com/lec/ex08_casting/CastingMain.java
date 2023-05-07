package com.lec.ex08_casting;
/*
 	참조타입의 강제타입변환(Casting)
 	
 	강제타입변환은 부모타입을 자식타입으로 변환하는것을 말한다. 형변환이 된다고 해서
 	모든 부모타입이 자식타입으로 강제형변환할 수 있는 것은 아니다.
 	
 	강제타입변환이 되는 경우는 자식타입이 부모타입으로 형변환이 된 후에 자식타입으로
 	변환되는 경우에만 강제타입변환을 할 수가 있다.
 	
 	자식타입이 부모타입으로 자동형변환하면 부모타입에 선언된 필드와 메서드만 사용 할 수가 있다.
 	자식타입이 부모타입으로 자동형변환이 되면 부모타입에서 선언된 필드와 메서드만 사용할 수가 있다.
 	만약, 자식타입에 선언된 필드와 메서드를 꼭 사용해야 하는 경우에는 강제형변환을해서 다시 자식타입으로
 	변환한 후에 자식타입의 필드와 메서드를 사용할 수 있다.
 */
public class CastingMain {

	public static void main(String[] args) {
		// 1 . 자동형변환
		Parent parent = new Child(); // 생성과 동시 자동형변환
		parent.field1 = "사용가능";
		//parent.field2 = "사용불가";
		parent.method1();
		parent.method2(); // 사용할 수 있지만 child에서 재정의
		// parent.method3(); ( x )
		System.out.println();
		
		// 2 . 강제형변환
		// 1) 형변환불가
		// 직접생성한 부모객체에서 자식객체로 형변환하는 경우는 불가
		// 자식객체 -> 부모객체 -> (부모타입)자식객체의 순서로 형변환하는 것은 가능하지만
		// 부모객체 -> (부모타입) 자식객체로 직접 형변환하는 것은 불가능
		int val = (int) 1.0d; // 강제형변환
		Parent parent2 = new Parent();
		// 문법에러는 아니지만 실행시에 에러가 발생한다.
		// java.lang.ClassCastException이 발생
		// Child child =(Child) parent2;
		//Child child = (Child)parent2;
		
		
		
		// 2) 형변환가능
		Child child =(Child)parent;
		child.field1 = "사용가능";
		child.field2 = "사용가능";
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		System.out.println("parent2 = " + parent2.getClass());
		System.out.println("parent = " + parent.getClass());
		System.out.println("child = " + child.getClass());
		System.out.println();
		
		System.out.println(parent == child); // true
		System.out.println(parent2 == child); // false, false일 경우에는 강제형변환하지 않도록 로직에 반영해야 한다.
		
		
		
	}

}












