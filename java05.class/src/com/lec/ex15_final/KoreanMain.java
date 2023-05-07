package com.lec.ex15_final;

public class KoreanMain {

	public static void main(String[] args) {
		
		//Korean.NATION = "미국";
		Korean hong = new Korean("홍길동","991234-1234567");
		System.out.println(hong);
		//hong.NATION = "미국";
		hong.name = "마동석";
		//hong.ssn = "971234-2234567";
		System.out.println(hong);
		System.out.println(hong.ssn);
		
		

	}

}
