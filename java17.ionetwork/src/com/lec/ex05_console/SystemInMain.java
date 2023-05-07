package com.lec.ex05_console;

import java.io.IOException;
import java.io.InputStream;

public class SystemInMain {

	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		System.out.println("이름 = ");
		int nameBytes = is.read(datas);
		String name = new String(datas,0,nameBytes-2);
		System.out.println("입력된 이름은 " + name + "입니다.");

	}

}
