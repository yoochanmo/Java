package com.lec.ex05_break;

public class BreakMain {

	public static void main(String[] args) {
		
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			if(num == 6) break;
			System.out.println("주사위 번호 = " + num);
		}
		System.out.println("주사위 던지기 종료");
	}

}
