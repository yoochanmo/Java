package com.lec.ex06_change.method;

public class MethodMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1(); //Parent
		child.method2(); //Child -> Parent.method2 재정의
		child.method3(); //Child -> Child에 새로 추가된 메서드
		System.out.println();
		
		// 1 . 자동형변환후에는 ? 자식객체에서 부모객체로 형변환
		Parent parent = child; // 자동형변환
		
		// 1) method1은 부모객체의 method1이 호출
		parent.method1();
		
		// 2) method2는 자식객체에서 재정의가 되었기 때문에
		//	  자식객체의 메서드 즉, child.method2()가 호출
		parent.method2();
		
		// 3) method3는 자식객체에서 새롭게 추가된 메서드이기 때문에
		//	  부모객체로 타입변환시에 삭제(짤리기)되기 때문에 호출불가
		// parent.method3();
		
		// 2 . parent와 child가 동일타입인지 여부를 비교
		System.out.println(parent == child); // true : child에서 parent로 형변환이 되었기 때문에 동일타입
		System.out.println(parent.equals(child)); // true
		
		Parent parent2 = new Parent();
		System.out.println(parent2 == child); // false
		System.out.println(parent2.equals(child)); // false
		System.out.println();
		
		System.out.println("parent = " + parent.getClass());
		System.out.println("child = " + child.getClass());
		System.out.println("parent = " + parent2.getClass());
		System.out.println();
		
		System.out.println(new Parent() == parent2); // true
		System.out.println((new Parent()).equals(parent2)); // true
		System.out.println("new Parent() = " + (new Parent()).getClass());
		System.out.println();
		
		// 1 . child -> parent -> child 강제형변환
		child = (Child)parent;
		child.method1();
		child.method2();
		child.method3();
		// 2 . parent2 -> child 강제형변환  -> 형변환불가 ClassCastException 예외발생
		// child = (Child)parent2; ( x )
	}

}
