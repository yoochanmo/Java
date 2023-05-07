package com.lec.ex07_auxstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 	보조스트림
 	
 	보조스트림이란 다른 스트림과 연결해서 다양한 기능을 제공해 주는 보조 스트림을 말한다. 보소스트림은
 	필터(Filter)스트림이라고도 한다. 보조스트림은 그 일부가 FilterInputStream, FilterOutputStream의 하위클래스이다.
 	
 	보조스트림은 입출력을 수행할 수 없기 때문에 InputStream,FilterInputStream,Reader, FileReader와
    연결해서 입력을 수행할 수 있고 OutputStream, FilterOutputStream, Writer, FileWriter와 연결해서 출력을 수행한다.
    
    1 . 문자변환 보조스트림 : InputStreamReader, OutputStreamWriter
    2 . 성능향상 보조스트림 : BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter
    3 . 기본타입 입출력 보조스트림 : DataInputStream, DataOutputStream
    4 . 프린터 보조스트림 : PrintStream, PrintWriter
 */
public class InputStreamReaderMain {

	public static void main(String[] args) throws Exception {
		
		// 콘솔에서 한글 입력받기
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); // byte단위에서 문자단위로 입력
		
		int readChar;
		char[] cbuf = new char[100];
		System.out.println("이름을 입력하세요 ==>");
		while((readChar = reader.read(cbuf)) != -1) {
			String data = new String(cbuf,0,readChar);
			System.out.println(data);
		}
		reader.close();

	}

}
