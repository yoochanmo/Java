package com.lec.ex02_array;

public class StringArgMain {

	public static void main(String[] args) {
		
		if(args.length < 5) {
			System.out.println("배열의 크기 = " + args.length);
			System.out.println("프로그램 강제 종료");
			System.exit(0); // 관례적으로 0 = 정상종료, 0이외는 비정상종료의미
		}
		
		
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("1 ~ " + args.length + " 까지의 합 = " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
