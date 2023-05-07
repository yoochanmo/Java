package com.lec.exercise.answer.Exercise7_26;

// 7 - 26 Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
class Outer {

	static class Inner {

		int iv = 200;

	}

}


public class Exercise7_26 {

	public static void main(String[] args) {
		
		// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓정답↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		Outer.Inner inner = new Outer.Inner();
		System.out.println(inner.iv);

	}

}
