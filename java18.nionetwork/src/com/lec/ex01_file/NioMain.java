package com.lec.ex01_file;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/*
 	NIO(New Input Output)
 	
 	Java4부터 새로운 입출력이라는 뜻에서 java.nio 패키지에 포함되었다. Java7에서 version up이 되면서
 	비동기 채널등의 네트워크 지원을 대폭 강화한 NI) 2.0 API가 추가 되었다. NIO2.0은 java.nio2패키지로
 	제공되지 않고 java.nio패키지로 통합되었다.
 	
 	1 . IO와 NIO 차이점
 		
 		a . 입출력방식  	: IO는 단방향(stream)이지만 NIO는 양방향(channel)이다.
 		b . 버퍼방식		: IO는 Non - buffer방식, NIO buffer 방식
 		c . 비동기방식 		: IO는 동기식만지원, NIO 동기/비동기 지원
 		d . 블럭킹			: IO는 블럭킹방식, NIO는 블럭킹/넌블럭킹 모두 지원
 		
 	2 . 파일과 디렉토리
 	
 		IO는 파일의 속성을 읽기 위해 File클래스만 제공하지만 NIO 좀 더 다양한 파일의 속성정보를
 		제공해 주는 클래스와 interface를 java.nio.file, java.nio.file.attribute 패키지를 제공한다.
 		
 		a . path		 : 파일 및 디렉토리 경로 정보
 		b . FileSystem	 : 파일의 시스템정보
 		c . File		 : 파일의 속성읽기, 및 파일/디렉토리의 생성, 삭제
 		d . WatchService : 파일/디렉토리에 생성, 수정, 삭제등의 이벤트를 모니터링 서비스
 */
public class NioMain {

	public static void main(String[] args) {
		
		// 1 . Path
		System.out.println("[Path]");
		Path path = Paths.get("src/com/lec/ex01_file/NioMain.java");
		System.out.println(path);
		System.out.println("파일이름 :" + path.getFileName());
		System.out.println("부모디렉토리 : " + path.getParent());
		System.out.println("부모이름 :" + path.getParent().getFileName());
		System.out.println("중첩경로갯수 : " + path.getNameCount());
		System.out.println();
		
		for(int i=0; i<path.getNameCount();i++) {
			System.out.println(path.getName(i));
		}
		System.out.println();
		
		// 반복자
		System.out.println("[반복자]");
		Iterator<Path> paths=path.iterator();
		while(paths.hasNext()) {
			Path temp = paths.next();
			System.out.println(temp.getFileName());
		}
		System.out.println();
		
		// toString
		System.out.println("[toString]");
		System.out.println(path.toString());

	}

}
