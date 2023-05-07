package com.lec.ex05_console;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutMain {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = System.out;
		
		for(byte b=48; b < 58; b++) {
			os.write(b);
		}
		os.write(10); // 10 = 엔터키, 13 = 리턴키
		os.write("대한민국만세".getBytes());
		os.flush();
		os.close();
	}


}
