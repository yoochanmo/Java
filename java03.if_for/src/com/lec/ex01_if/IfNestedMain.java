package com.lec.ex01_if;

public class IfNestedMain {

	public static void main(String[] args) {
		
		// 난수를 81 ~ 100 사이의 난수를 발생시키기
		Math.random(); // 0 <= random < 1 범위의 실수한개를 리턴
		double num = Math.random();
		System.out.println(num); 
		System.out.println(num * 20); // 0.0 <= x < 20
		System.out.println((int)(Math.random() * 20) + 81); // 81.0 <= x < 100.0
		
		int score = (int)(num * 20)+81;
		
		// 중텁 if 문
		// 1 . >= 90 -> 95 >= A+, A0;
		// 2 . >= 80 -> 85 >= B+, B0;
		String grade = "";
		if (score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		}else if(score >= 80) {
			if(score >= 85) {
				grade = "B+";
			}else {
				grade = "B0";
			}
		}
		System.out.println(grade + "학점입니다.");
	}

}
