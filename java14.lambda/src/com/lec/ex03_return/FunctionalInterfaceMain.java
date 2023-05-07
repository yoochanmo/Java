package com.lec.ex03_return;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {

		MyInterface fi = null;
		
		fi = new MyInterface() {
			@Override
			public int mymethod(int x, int y) {
			return x + y;
			}
		};
		System.out.println("fi.mymethod(10, 10) = " + fi.mymethod(10, 10));
		
		// 매개변수가 한 개이상일 경우는 소괄호를 생략할 수 없다.
		fi = (a,b) -> {return a + b;};
		System.out.println("fi.mymethod(20, 10) = " + fi.mymethod(20, 10));
		
		// return문이 있을 경우 실행문이 한 개라도 중괄호를 생략할 수 없다.
		// 대신에 return문을 생략할 수 있다.
		fi = (a,b) ->  a + b;
		System.out.println("fi.mymethod(30, 10) = " + fi.mymethod(30, 10));
		
		fi = (a,b) ->  a - b;
		System.out.println("fi.mymethod(30, 10) = " + fi.mymethod(30, 10));
		
		fi = (a,b) ->  a * b;
		System.out.println("fi.mymethod(30, 10) = " + fi.mymethod(30, 10));
		
		fi = (a,b) ->  a / b;
		System.out.println("fi.mymethod(30, 10) = " + fi.mymethod(30, 10));
		// System.out.println("fi.mymethod(30, 10) = " + fi.mymethod(30, 0)); java.lang.ArithmeticException: / by zero
		
		// 람다식에 함수를 정의
		fi = (x,y) -> (int)div(10, 0);
		System.out.println("10 / 0 = " + fi.mymethod(10, 0));
		
		fi = (x,y) -> (int)div(10, 5);
		System.out.println("10 / 5 = " + fi.mymethod(10, 5));
		
	}

	private static double div(int i, int j) {
		if(j == 0) {
			System.out.println("0으로 나눌 수가 없습니다.");
			return 0.0;
		}else {
			double result = i / j;
			return result;
		}
	}

}
@FunctionalInterface
interface MyInterface{
	int mymethod(int x, int y);
}