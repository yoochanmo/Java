package com.lec.ex01_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 	InputStream
 	
	InputStream은 바이트기반 입력스트림의 최상위 추상클래스이다. FileInputStream, DataInputStream, BufferedInputStream은 모두 InputStream을 상속하고 있다.
	
	InputStream의 주요메서드
	
	1 . read()	: 입력스트림으로 부터 1byte씩 읽어서 int타입으로 리턴
	2 . read(byte[]b)	: 입력스트림으로부터 주어진 byte배열의 크기만큼 읽어서 읽은 바이트수만큼 리턴
	3 . read(byte[], int off, int len) : 입력스트림으로 부터 주어진 byte배열을 주어진 배열의 off바이트에서
										  len바이트수만큼 읽어서 리턴
	4 . close()	: 입력스트림을 더이상 사용하지 않을 경우 사용한 자원을 메모리에서 해제
 */
public class ReadMain1 {

	public static void main(String[] args) throws Exception {
		// 1 . read()
		InputStream is = new FileInputStream("src/com/lec/ex01_input/news.txt");
		System.out.println(is);
		
		int read_bytes;
		
		while(true) {
			read_bytes = is.read(); // 1byte를 읽어서 4바이트인 int타입으로 리턴
			if(read_bytes == -1) break;
			System.out.println(read_bytes + " = " + (char)read_bytes);
		}
		is.close();

	}

}
