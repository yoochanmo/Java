package com.lec.ex02_kind;

import java.util.stream.*;

public class FromRangeMain {

	// stream에서 사용되는 변수는 static으로 선언해야 한다.
	// 또한, 클래스멤버로 선언되야 한다.
	static int sum = 0;
	
	public static void main(String[] args) {
		
		// 3 . 숫자범위로 부터 Stream을 얻기
		IntStream stream = IntStream.range(1, 5); // 
		stream.forEach(n -> sum += n);
		System.out.println("1 ~ 4까지 합 = " + sum);
		
		sum = 0;
		stream = IntStream.rangeClosed(1, 5); // 
		stream.forEach(n -> sum += n);
		System.out.println("1 ~ 5까지 합 = " + sum);
		


	}

}
