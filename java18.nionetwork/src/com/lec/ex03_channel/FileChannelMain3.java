package com.lec.ex03_channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileChannelMain3 {

	public static void main(String[] args) throws Exception {
		
		
		Path from = Paths.get("src/com/lec/ex02_buffer/다운로드.jpg");
		Path to = Paths.get("c:/temp/다운로드.jpg");
		// 1 . copy() 메서드를 이용하지 않고 파일복사하기
		// a . 파일읽기
		FileChannel fc_fr = FileChannel.open(from, StandardOpenOption.READ);
		// b . 파일쓰기
		FileChannel fc_to = FileChannel.open(to, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		ByteBuffer buffer = ByteBuffer.allocateDirect(200);
		int count;
		
		while(true) {
			buffer.clear();
			count = fc_fr.read(buffer);
			if(count == -1)break;
			buffer.flip();
			fc_to.write(buffer);
		}
		
		// c . 닫기
		fc_fr.close();
		fc_to.close();
		System.out.println("파일이 성공적으로 복사가 되었습니다. - copy()메서드 사용하지 않고 복사");
		
		// 2 . copy() 메서드를 이용하고 파일복사하기
		to = Paths.get("c:/temp/다운로드.jpg");
		Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("파일이 성공적으로 복사가 되었습니다. - copy()메서드 사용하지 않고 복사");

	}

}
