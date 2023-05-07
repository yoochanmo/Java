package com.lec.ex07_auxstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 	프린트보조스트림
 	
 	PrintStream과 PrintWriter는 프린터와 유사하게 출력하는 print(), println()메서드를 가지고 있는 보조스트림이다.
 	우리가 빈번하게 사용했던 콘솔출력스트림인 System.out이 바로 PrintStream타입이기 때문에 print(), println()메서드를 사용 할 수 있다.
 	PrintStream은 바이출력스트림과 연결되고 PrintWriter는 문자스트림과 연결된다.
 */
public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린트보조스트림]");
		ps.println("동해물과 백두산이");
		ps.println("마르고 닳도록");
		ps.println("하느님이 보우하사");
		ps.println("우리나라 만세");
		
		fos.close();
		ps.close();

	}

}
