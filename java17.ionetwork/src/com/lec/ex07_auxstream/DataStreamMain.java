package com.lec.ex07_auxstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 	기본타입 입출력 보조 스트림
 	
 	바이트스트림은 바이트단위로 입출력하기 때문에 자바의 기본타입인 boolean, int, double...은
 	해당 데이터타입단위로 입출력할 수가 없다. 그러나 DataInputStream과 DataOutputStream보조스트림을
 	이용해서 기본 데이터타입을 입출력할 수가 있다.
 	
 	DataStream의 주요 메서드
 	
 	1 . DataInputStream
 		
 		a . readXXX() : Boolean, Byte, Char...
 		b . readUTF() : 문자를 utf-8형태로 읽기
 	
 	
 	2 . DataOutputStream
 	
 		a . writeXXX() : Boolean, int, Double...
 		b . writeUTF() : 문자를 utf-8 형태로 쓰기
 		
 */
public class DataStreamMain {

	public static void main(String[] args) throws Exception {


		FileOutputStream fos = new FileOutputStream("c:/temp/test.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(10);
		dos.writeUTF("홍길순");
		dos.writeDouble(90.5);
		dos.writeInt(20);
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("c:/temp/test.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int sno = dis.readInt();
			System.out.println(name + "의 점수 = " + score + ", 학생번호 = " + sno);
		}
		dis.close();
		fis.close();

	}

}


















