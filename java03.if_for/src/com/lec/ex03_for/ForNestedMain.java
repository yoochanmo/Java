package com.lec.ex03_for;

public class ForNestedMain {

	public static void main(String[] args) {
		// 구구단
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(" ---"+ dan + "단---");
			for(int i = 1; i<=9; i++) {
				System.out.println(dan + "X" + i + " = " + (dan * i));
			}
		}
		
	}

}
