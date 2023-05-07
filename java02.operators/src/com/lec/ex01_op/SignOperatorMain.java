package com.lec.ex01_op;

public class SignOperatorMain {

	public static void main(String[] args) {
	
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		// short는 2byte크기
		short s = 100;
		
		// short result = -s; // 정수타입은 int타입으로 연산되어 수행
		int result3 = -s;
		System.out.println(result3);
	}

}
