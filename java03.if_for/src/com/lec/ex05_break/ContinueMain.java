package com.lec.ex05_break;

public class ContinueMain {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			//if(i%2==0) System.out.println(i);
			if(i%2!=0) continue;
			System.out.println(i);
		}

	}

}
