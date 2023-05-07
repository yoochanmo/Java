package com.lec.ex03_for;

public class ForMain {

	public static void main(String[] args) {
		
		// i는 지역변수 즉 , for문 블럭에서만 사용가능한 변수
		for(int i = 0; i < 10; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		// 1 ~ 100까지 합
		int sum = 0;
		int i = 0; //전역변수
		for(i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("1부터 100까지 합" + sum);
		}
	}

}
