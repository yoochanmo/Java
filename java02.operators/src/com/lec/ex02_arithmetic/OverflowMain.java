package com.lec.ex02_arithmetic;

public class OverflowMain {

	public static void main(String[] args) {
		// 산술연산 할 때 주의할 점은 연산후의 값이 데이터타입으로 충분히 표현가능한지
		// 여부를 확인해야 한다. 표현할 수 없는 값이 산출될 경우 overflow가 발생되고
		// 결과값은 쓰레기값(엉뚱한 값)을 얻을 수 있다.
		
		int x = 1000000;
		int y = 1000000;
		int z = x + y;
		System.out.println("x + y = " + z);
		
		z = x * y;
		System.out.println("x * y = " + z);

		// 상기와 같은 에러를 방지하기 위해서는 두 변수중 하나는 long으로 선언되어야
		// 하고 z의 데이터 타입도 long이 되어야 한다.
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1 * y1;
		System.out.println("x1 * y1 = " + z1);
	}

}
