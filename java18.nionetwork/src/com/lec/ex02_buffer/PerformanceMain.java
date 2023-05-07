package com.lec.ex02_buffer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceMain {

	public static void main(String[] args) throws Exception {
		
		Path from = Paths.get("src/com/lec/ex02_buffer/다운로드.jpg");
		Path to1 = Paths.get("src/com/lec/ex02_buffer/다운로드_01.jpg");
		Path to2 = Paths.get("src/com/lec/ex02_buffer/다운로드_02.jpg");

		long size = Files.size(from);
		System.out.println(size);
		
		FileChannel fileChannelFrom = FileChannel.open(from);
		FileChannel fileChannelTo1 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		FileChannel fileChannelTo2 = FileChannel.open(to2,EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		
		ByteBuffer ndb = ByteBuffer.allocate((int) size);
		ByteBuffer db = ByteBuffer.allocateDirect((int) size);
		long start,end;
		
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannelFrom.read(ndb);
			ndb.flip(); // 현재위치를 0으로 설정
			fileChannelTo1.write(ndb);
			ndb.clear();
		}
		end = System.nanoTime();
		System.out.println("NonDirectBuffer의 소요시간 = " + (end - start) + " ns");
		
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannelFrom.read(db);
			db.flip(); // 현재위치를 0으로 설정
			fileChannelTo2.write(db);
			db.clear();
		}
		end = System.nanoTime();
		System.out.println("NonDirectBuffer의 소요시간 = " + (end - start) + " ns");
		
		fileChannelFrom.close();
		fileChannelTo1.close();
		fileChannelTo2.close();
		
	}

}
