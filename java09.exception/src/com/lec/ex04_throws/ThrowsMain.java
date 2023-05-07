package com.lec.ex04_throws;

/*
 	예외를 떠넘기기(throws)
 	
 	메서드 내부에서 예외가 발생할 경우 코딩을 할 대 try~catch로 예외처리하는 것이 기본이지만
 	경우에 따라서는 메서드를 호출할 곳으로 예외를 떠넘길 수가 있다.
 	이 때 사용하는 명령이 "throws"이다. throws명령은 메서드 선언부에 작성되어 메서드에서 처리하지 않고
 	메서드를 호출한 곳으로 예외를 떠넘기는 역할을 한다.
 	
 	throws명령은 떠넘길 예외클래스를 콤마(,)로 구분해서 나열해 주면된다. throws키워드가 붙어있는
 	메서드는 반드시 try ~ catch 블럭에서 떠넘겨 받은 예외처리를 해야 한다.
 */

public class ThrowsMain {

	public static void main(String[] args) throws Exception {
		
		// Class _class = Class.forName("java.lang.Stringxxxx");
		// String data = args[0]
		// int val1 = Integer.parseInt("111a");
		
		method();
		method2();
	}

	private static void method() throws ClassNotFoundException {
		
		Class _class = Class.forName("java.lang.Stringxxxx");
	}

		void method1() {
			try {
				method();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
private static void method2() {
	try {
		throw new ClassNotFoundException(); // 강제로 Exception 객체를 생성
		} catch (Exception e) {
		System.out.println("강제로 예외가 발생했습니다. ");
	}
}
		
}
