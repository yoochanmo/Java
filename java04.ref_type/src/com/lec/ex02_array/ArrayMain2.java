package com.lec.ex02_array;

public class ArrayMain2 {

	public static void main(String[] args) {
		// 2 . new 연산자 - 배열선언 및 초기화
		int scores[]; // 배열의 선언만 되어 있음. 크기, 값등은 선언되어 있지 않음.
		// System.out.println(scores[0]); 에러 - not have been initialized
		scores = new int[] {90,95,88,90,89,100,99,78,66,65,88,99};
		
		int sum = 0;
		for(int i=0; i<scores.length;i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
			sum += scores[i];
		}
		System.out.println("배열의 요소의 합계 = " + sum);
		System.out.println("배열의 요소의 평균 = " + (sum / scores.length) + "\n");
		
		
		// 3 . 메서드를 이용한 배열처리
		int tot = total(scores);
		System.out.println("배열의 요소의 합계 = " + sum);
		System.out.println("배열의 요소의 평균 = " + (sum / scores.length) + "\n");
		
		
		}
	
		// Static이 붙은것과 안붙은것의 차이점은 사용시점이 다르다
		void xxx() {} // 가장 기본적인 메서드
	
	public static int total(int[] scores) {
		int tot = 0;
		for(int score : scores) {
			tot += score;
		}
		return tot;
		
		
		
		
		
		
		
	
	}

}
