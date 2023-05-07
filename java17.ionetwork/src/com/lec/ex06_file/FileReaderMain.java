package com.lec.ex06_file;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 	FileReader
 	
 	이 클래스는 텍스트파일을 프로그램으로 읽어 들일 때 사용하는 문자기반 스트리밍이다. 문자단위로 읽기 때문에
 	텍스트가 아닌 이미지, 오디오등의 파일은 읽을 수가 없다.
 	
 	생성하는 방법
 	
 	1 . FileReader fr = new FileReader(파일위치);
 	2 . File file = new File(파일위치);
 		FileReader = fr = new FileReader(file);
 */
public class FileReaderMain {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("src/com/lec/ex06_file/FileMain.java");
		
		int readChar;
		char[] cbuf = new char[100];
		while((readChar = fr.read(cbuf))!= -1) {
			String data = new String(cbuf,0,readChar);
			System.out.println(data);
		}
		fr.close();

	}

}
