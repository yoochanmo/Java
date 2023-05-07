package com.lec.answer;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
		
			if(num1 + num2 == 5) {
				System.out.println("주사위의 합이 5가 나왔습니다");
				break;
			}
		}
		
		
		
		
		
		
	}

}
