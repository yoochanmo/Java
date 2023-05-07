package com.lec.ex02_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FromFileMain {

	public static void main(String[] args) throws IOException {
		// 4 . 파일로 부터 Stream을 얻기
		Stream<String> stream = null;
		
		// 1 ) 파일위치
		Path path = Paths.get("D:\\myname/05.java/java16.stream/src/com/lec/datafile.txt");
		System.out.println(path);
		System.out.println();
		
		// 2 ) 파일읽기(1) - java.nio.file.Files의 lines()메서드 이용
		stream = Files.lines(path);
		stream.forEach(System.out :: println);
		System.out.println();
		
		// 3 ) 파일읽기(2) - java.io.BufferedReader.lines()메서드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println);
		stream.close();
		br.close();
		fileReader.close();
		
		

	}

}
