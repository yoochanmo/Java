package com.lec.exercise.exam.Exercise15_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Exercise15_2 {

	public static void main(String[] args) throws Exception {
		
// D:\myname\05.java\java17.ionetwork\src\com\lec\exercise\exam\Exercise15_2\Exercise15_2.java
		if(args.length !=1) {
			System.out.println("USAGE: java HexaViewer FILENAME");
			System.exit(0);
		}
		
		String inputFile = args[0];
		
		try {
			FileInputStream input = new FileInputStream(inputFile);
			PrintStream	output = new PrintStream(System.out);
			
			int data = 0;
			int i = 0;
			
			while((data = input.read()) != -1){
				output.printf("%02X ", data);
				if(++i%16==0)
					output.println();
			}
			
			input.close();
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
