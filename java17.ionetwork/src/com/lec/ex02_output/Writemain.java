package com.lec.ex02_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 	OutputStream
 	
 	OutputStream은 바이트기반 출력스트림의 최상위 추상클래스이다. 모든 바이트기반 출력스트림
 	FileOutputStream, PrintOutputStream, BufferedOutputStream, DataOutputStream은 모두 아웃풋스트림을 상속한다.
 	
 	OutputStream의 주요메서드는
 	
 	1 . write(int byte) : 1byte 씩 출력
 	2 . write(byte[] b) : 매개값으로 주어진 배열의 바이트 수만큼 출력
 	3 . write(byte[] b, int off, int len) : b의 off~len까지의 바이트수만큼 출력
 	4 . flush() : 버퍼에 잔류한 바이트 전부를 출력
 	5 . close() : 사용된 자원을 메모리에서 해제
 	
 	
 */
public class Writemain {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/com/lec/ex02_output/text.txt");

		// 1 . write(int byte)
		byte[] data = "대한민국만세".getBytes();
		System.out.println(data.toString());
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
		
		// 2 . write(byte[] b) 
		os = new FileOutputStream("src/com/lec/ex02_output/text1.txt");
		data = "1234567890".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
		// 3 . write(byte[] b, int off, int len)
		os = new FileOutputStream("src/com/lec/ex02_output/text2.txt");
		data = "1234567890".getBytes();
		os.write(data,1,3);
		os.flush();
		os.close();
	}

}
