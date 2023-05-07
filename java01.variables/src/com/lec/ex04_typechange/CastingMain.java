package com.lec.ex04_typechange;

public class CastingMain {

	public static void main(String[] args) {
		// 형변환
		// 1 . 강제형변환(Casting)
		System.out.println("강제형변환");
		float f1 = (float) 3.14; // double인 3.14를 float로 강제형변환후에 f1에 대입
		
		int i1 = 44032; // '가'
		char c1 = '가';
		c1 = (char) i1; // int(4byte)를 char(1byte)로 강제형변환
		System.out.println(c1 + "의 유니코드 값 = " + i1);
		System.out.println(i1 + "의 유니코드 값 = " + i1);
		System.out.println((char)i1 + "의 유니코드 값 = " + i1);
		System.out.println();
		
	
	
		System.out.println("자동형변환");
		long l1 = 500; // int(4byte)인 500을 long타입인 l1으로 자동형변환
		i1 = (int) l1; // 강제형변환
		System.out.println(i1 + "의 값 = " + l1);
		double d1 = 3.141592; // 형변환이 발생되지 않음.
		System.out.println(d1 + "의 값 = " + d1);
		System.out.println();
		// 2 . 강제형변환시에 값이 짤리는 경우
		System.out.println("강제형변환시에 값이 짤리는 경우");
		i1 = (int) d1; // 강제형변환
		System.out.println(i1 + "의 값 = " + d1);
		
		byte b1 = (byte) 128;
		System.out.println(b1 + "의 값 = " + b1);
		b1 = (byte) 100000;
		System.out.println(b1 + "의 값 = " + b1);
		System.out.println();
		
		// 3 . 연산시 형변환
		System.out.println("연산시 형변환");
		double d2 = 10 + 3.141592; // int(10)이 double(10.) 자동형변환후에 연산
		System.out.println(d2 + "의 값 = " + d2);
		
		d2 = 10 +(int)3.141592; // double(3.141592)가 int(3)로 강제형변환후에 연산후 double로 자동형변환
		System.out.println(d2 + "의 값 = " + d2);
		
		d2 = (int)(10 + 3.141592); // int(10)이 double(10.0)으로 자동형변환후 연산결과(13.141592)가 int로 강제형변환후
								   // double로 자동형변환
		int i2 = (int)(10 + 3.141592);// int(10)이 double(10.0)으로 자동형변환후 연산결과(13.141592)가 int로 강제형변환후
									  // 결과값을 대입
		
		
	}

}
