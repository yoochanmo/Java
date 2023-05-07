package com.lec.ex01_op;

public class DenyLogicOperatorMain {

	public static void main(String[] args) {
		// 논리부정연산자(!)는 true 또는 false를 부정하는 연산자로서 boolean타입에만
		// 사용할 수 있다. 피연산자가 true이면 false, false이면 true를 리턴한다.
		// 논리부정연산자는 조건문과 제어문에서 사용되어 조건식의 값을 부정하도록 하여
		// 실행흐름을 제어할 때 주로 사용한다.
		
		boolean isPlay = true;
		System.out.println("isPlay = " + isPlay);
		
		isPlay = !isPlay;
		System.out.println("isPlay = " + isPlay);

		isPlay = !isPlay;
		System.out.println("isPlay = " + isPlay);
	}

}
