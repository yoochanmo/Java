package com.lec.ex02_try_catch;

public class TryCatchMain2 {

	public static void main(String[] args) {
		
		// 2 . 실행예외
		String data1 = null;
		String data2 = null;
		
		//java.lang.ArrayIndexOutOfBoundsException
		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("args.length = " + args.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("args.length = "+ args.length + " ,실행매개변수가 부족합니다.");
			System.out.println(e.getClass());
			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		}
		System.out.println();
		
		System.out.println( data1 + ", " + data2);
		
		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println("val1 + val2 = " + (val1 + val2));
		} catch (NumberFormatException e) {
			System.out.println(data1 + "또는 " + data2 +" 는 숫자로 변환할 수가 없습니다.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("아주 중요한 로직 처리.");
	}

}
