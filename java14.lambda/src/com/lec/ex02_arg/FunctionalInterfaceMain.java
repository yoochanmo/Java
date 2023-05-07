package com.lec.ex02_arg;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		

		MyInterface fi = null;
		
		fi = new MyInterface() {
			@Override
			public void method(int a) {System.out.println("fi의 매개변수 a = " + a);}
		};
		fi.method(10);
		
		fi = (int a) -> {System.out.println("fi의 매개변수 a = " + a);};
		fi.method(20);
		// fi.method("문자"); (x)
		
		fi = (a) -> {System.out.println("fi의 매개변수 a = " + a);};
		fi.method(30);
		
		fi = (a) -> {System.out.println("fi의 매개변수 a = " + a);};
		fi.method(40);
		
		fi = (a) -> System.out.println("fi의 매개변수 a = " + a);
		fi.method(50);
		
		fi = a -> {
			int result = a + 10;
			 System.out.println("fi의 매개변수 a + 10의 결과 = " + result);
		};
		fi.method(50);
	}

}
@FunctionalInterface
interface MyInterface{
	void method(int a);
}