package com.lec.exercise.answer;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100까지의 3의 배수 총합은" + sum + "입니다.");
		
	}

}
