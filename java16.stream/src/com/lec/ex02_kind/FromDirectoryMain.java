package com.lec.ex02_kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryMain {

	public static void main(String[] args) throws IOException {
		// 5 . 디렉토리 부터 Stream을 얻기
		Path path = Paths.get("D:\\\\myname/05.java/");
		Stream<Path> stream = Files.list(path);
		stream.forEach(System.out::println);
		System.out.println();
		
		stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
		System.out.println();
		
		stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getName(0) + ", " + p.getName(1) + ", " +  p.getName(2)));
		System.out.println();
		

	}

}
