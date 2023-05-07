package com.lec.ex03_compare;

public class ConditinalCompareMain {

	public static void main(String[] args) {
		// 삼항연산자 (조건식 ? true일경우 : false일경우)는 세개의 피연산자를 필요로 하는
		// 연산자를 말한다. 삼항연산자는 ? 앞의 조건식에 따라 콜론(:) 앞뒤의 피연산자가
		// 선택된다고 해서 조건연산식이라고 하기도 한다.
		// 사용방법은
		// 조건식 ? 값 or 표현식 : 값 or 표현식
		
		int score = 100;
		if(score > 90) {
			System.out.println("A야");
		} else {
			System.out.println("B야");
		}

		// 삼항연산식
		//(score >= 90) ? System.out.println("A야") : System.out.println("B야"); 에러
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println(grade + "학점임.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
