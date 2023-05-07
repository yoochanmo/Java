package com.lec.ex03_multi_catch;

import com.lec.ex01_runtime.ArrayIndexOutofBoundExceptionMain;
import com.lec.ex01_runtime.NumberFormatExceptionMain;

public class MultiCatchMain {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			
			Class _class = Class.forName("java.lang.Stringxxxx");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("args.length = "+ args.length + " ,실행매개변수가 부족합니다.");
//
//		} catch (NumberFormatException e) {
//			System.out.println(data1 + "또는 " + data2 +" 는 숫자로 변환할 수가 없습니다.");
//			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
		System.out.println("인덱스예외 or 숫자변환예외가 발생.");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생했습니다..");
	
		} finally {
			System.out.println("프로그램종료");
		} 
	
	}

	}

