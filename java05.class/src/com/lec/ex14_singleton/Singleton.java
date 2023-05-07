package com.lec.ex14_singleton;

/*
 	 싱글톤(singleton) 디자인패턴 
 	 
 	 프로그램에서 단 한개의 객체만 생성되도록 해야 하는 경우가 있는데
 	 객체가 단 한개만 생성된다고 해서 이러한 객체를 singleton객체라고 한다.
 	 
 	 싱글톤객체를 만드는방법
 	 
 	 1 . 외부에서 new연산자로 생성자를 호출할 수 없도록 막아야 하는데 그 이유는 생성자를 호출한
 	 	 만큼 객체가 생성되기 때문이다. 생성자를 외부에서 호출할 수 없도록 하려면 생성자에 접근제한자
 	 	 private으로 선언해 외부에서 접근하지 못하도록 막는다.
 	 	 
 	 2 . 자신의 참조타입 정적필드를 하나 선언하고 자신의 객체를 생성해서
 	 	 초기화 한다. 이 객체를 외부에서 접근하지 못하도록 private로 선언 
 	 	 
 	 3 . 생성된 객체를 외부에서 접근하도록 getter 메서드를 선언해서 생성된 객체를 리턴하도록 해서 외부에 전달할 수 있도록 한다.
 	 
 */
public class Singleton {
	
	private Singleton() {} // 1. 
	
	private static Singleton singleton = new Singleton(); // 2. 
	
	static Singleton getInstance() {
		//if(singleton == null) singleton = new Singleton();
		return singleton;
	}
}
