package com.lec.ex02_switch;

public class SwitchStringMain {

	public static void main(String[] args) {
		
		// Java6까지는 switch(조건)의 조건에는 정수타입(byte ~ long)만 가능
		// 그 이후 버전부터는 문자열(String)도 가능하게 되었다.
		String position = "과장";
		
		switch(position) {
		case "부장" : 
			System.out.println("부장의 급여는 1000만원");
			break;
		case "차장" : 
			System.out.println("차장의 급여는 900만원");
			break;
		case "과장" : 
			System.out.println("과장의 급여는 800만원");
			break;
		default :
			System.out.println("기타사원의 급여는 800만원 이하입니다.");
		}

	}

}
