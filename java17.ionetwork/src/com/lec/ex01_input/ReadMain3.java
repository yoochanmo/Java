package com.lec.ex01_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadMain3 {

	public static void main(String[] args) throws Exception {
		// 3 .  read(byte[]b)
		InputStream is = new FileInputStream("src/com/lec/ex01_input/news.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes,2,3);
		for(int i = 0; i < readBytes.length; i++) {
			System.out.println((char)readBytes[i]);
		}
		is.close();
	}

}
