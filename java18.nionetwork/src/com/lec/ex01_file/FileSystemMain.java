package com.lec.ex01_file;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemMain {

	public static void main(String[] args) throws Exception {
		// 2 . FileSystem
		// getFileStores()		: 드라이브 경로를 가진 FileSystem객체를 리턴
		// getRootDirectories() : root 디렉토리 정보
		// getSperator()		: 디렉토리구분자
		
		
		FileSystem fs = FileSystems.getDefault();
		
		for(FileStore store:fs.getFileStores()) {
			System.out.println("[드라이브명]\t" + store.name());
			System.out.println("[파일시스템]\t" + store.type());
			System.out.println("[전체메모리]\t" + store.getTotalSpace() + "bytes");
			System.out.println("[사용메모리]\t" + (store.getTotalSpace() - store.getUnallocatedSpace()) + "bytes");
			System.out.println("[가능메모리]\t" + store.getUsableSpace());
			System.out.println();
		}
		System.out.println("[파일구분자]\t" + fs.getSeparator());
		System.out.println();
		
		for(Path path:fs.getRootDirectories()) {
			System.out.println(path.toString());
		}
		
	}

}
