package com.lec.exercise.answer.Exercise7_25;

// 7 - 25 Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.

class Outer {

	class Inner {

		int iv = 100;

	}

}

public class Exercise7_25 {

	public static void main(String[] args) {
	// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓정답↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		Outer outer = new Outer();

		Outer.Inner inner = outer.new Inner();

		System.out.println(inner.iv);
	}

}
