package com.lec.ex02_array;

public class CommandMain {

	public static void main(String[] args) {
		// ~.java -> javac.exe -> ~.class -> java.exe 실행
		// 외부에 ~.class파일을 실행하기 위해서는 'c:\\yourfolder\java.exe 클래스실행파일' 형식으로 실행
		// 예를 들어 덧셈연산을 하는 클래스실행파일이 있을 경우에 외부에서 2개의 피연산자를 전달해 주어
		// 야 한다. 일반적으로 메서드를 호출할 때 매개변수의 갯수 만큼 전달하는 것처럼 ~.class파일에 매개
		// 변수를 전달하는 것은 배열로 전달된다.
		// 외부에서 매개변수를 전달하는 방법은 'c:\\yourfolder\java 클래스실행파일 값1,...값n' 처럼 한다.
		int[] val = {1,2};
		System.out.println("val[0] + val[1] = " + (val[0] + val[1]));
		System.out.println("배열 의크기 = " + args.length);
		System.out.println("args[0] + args[1] = " + (args[0] + args[1]));
		System.out.println("args[0] + args[1] = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
		System.out.println();
		
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("1~10까지의 합 = " + sum);
	}

}
