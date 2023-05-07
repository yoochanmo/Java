package com.lec.ex01_file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryMain {

	public static void main(String[] args) throws Exception {
		// 4 . Directory
		Path path1 = Paths.get("c:/temp/dir/subdir1");
		Path path2 = Paths.get("c:/temp/dir/subdir1/file.txt");
		
		if(Files.notExists(path1)) {
			Files.createDirectories(path1);
		}

		if(Files.notExists(path2)) {
			Files.createFile(path2);
		}
		
		Path path3 = Paths.get("c:/temp");
		DirectoryStream<Path> ds = Files.newDirectoryStream(path3);
		for(Path path:ds) {
			if(Files.isDirectory(path)) {
				System.out.println(path.getFileName() + " <div>");
			}else {
				System.out.println(path.getFileName() + ":( 크기 : " + Files.size(path) + ")");
			}
		}
		
	}

}
