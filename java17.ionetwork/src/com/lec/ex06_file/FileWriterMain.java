package com.lec.ex06_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("c:/temp/한숨.txt");
		FileWriter fw = new FileWriter(file, true); //false이면 덮어써지고, true면 계속 쌓임.
		
		fw.write("숨도 쉬지 마세요\r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일이 성공적으로 저장되었습니다.");
	}

}
