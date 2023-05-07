package com.lec.ex02_buffer;

import java.nio.ByteBuffer;

/*
 		NIO에서는 데이터를 입출력하려면 항상 버퍼를 사용해야 한다. Buffer의 종류는 어떤 메모리를 사용하느냐에 따라 Direct와 NonDirect로 구분된다.
 		
 		NonDirect버퍼는 JVM이 관리하는 Heap메모리 공간을 이용하는 버퍼이고 Direct버퍼는 운영체제에서 관리하는 메모리공간을 이용하는 버퍼이다.
 		두 버퍼의 차이점은 버퍼생성시간이 NonDirect버퍼가 빠르고 버퍼의 크기는 NonDirect버퍼가 작다. (큰 데이터를 처리할 때는 Direct버퍼를 이용 하는것이 좋다)
 		입출력성능은 NonDirect의 성능이 낮다.
 		
 */
public class BufferMain {

	public static void main(String[] args) {
	
		ByteBuffer db = ByteBuffer.allocateDirect(200*1024*1024);
		System.out.println("다이렉트버퍼를 생성");
		
		// 컴퓨터의 성능고 ㅏ현재 메모리상태에 따라서 OutOfMemory)가 발생할 수 있다.
		ByteBuffer ndn = ByteBuffer.allocate(200*1024*1024);
		System.out.println("넌다이렉트버퍼를 생성");
		
	}

}
