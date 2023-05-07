package com.lec.ex04_typechange;

/*
 	형변환(Casting, Promotion)이란?
 	
 	모든 리터럴과 변수는 데이터타입이 있다. 프로그램을 작성하다 보면 서로 다른 데이터타입의
 	값을 연산하는 경우가 자주 발생하는데 모든 연산은 기본적으로 동일 타입의 데이터만 연산할 수 있기
 	때문에 서로 다른 타입의 연산을 수행하는 경우에는 연산을 수행하기 전에 형변환을 통해 동일 타입의 데이터타입으로
 	변환해 주어야 한다.
 	
 	형변환이란? 변수 또는 리터럴의 데이터 타입을 다른 데이터타입으로 변환하는 것을 말한다.
 	큰 크기의 데이터타입에서 작은 크기의 데이터타입으로 변환하는 것을 '강제형변환(Casting, 명시적)'이라 하고
 	작은 크기에서 큰 크기의 데이터타입으로 변환하는것을 '자동형변환(Promotion, 묵시적)'이라고 한다.
 	
 	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
 	
 	자동형변환은 자동으로 변환되기 때문에 개발자가 별도로 정의할 것이 없지만 수동형변환은
 	개발자가 명시적으로 선언해야 한다. Casting방법은 아래와 같다.
 	
 	데이터타입 변수명 = (데이터타입) 값 [or 표현식(변수 or 연산수행)]
 	
 	a . double d1 = int_value + double_value; // int_value가 double로 자동형변환후 연산결과가 double로 저장
 	b . double d1 = (double) int_value + double_value;
 	c . double d1 = int_value + (int) double_value;
 	d . double d1 = (double) (int+value + (int)double_value);
 */


public class PromotionMain {

	public static void main(String[] args) {
		// 2. 자동형변환
		byte b1 = 10; // 강제형변환
		int i1 = b1; // 자동형변환
		System.out.println("i1 = " + i1);
		
		char c1 = '가';
		i1 = c1; // 자동형변환
		System.out.println("i1 = " + i1);
		
		long l1 = i1;
		System.out.println("l1 = " + l1);
		
		float f1 = l1;
		System.out.println("f1 = " + f1);
		
		double d1 = f1;
		System.out.println("d1 = " + d1);
		
		
		

	}

}
