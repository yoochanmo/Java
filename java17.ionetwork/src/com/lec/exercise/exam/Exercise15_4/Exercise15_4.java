package com.lec.exercise.exam.Exercise15_4;

import java.io.*;

import java.util.*;

public class Exercise15_4 {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ... ");
			System.exit(0);

		}

		try {
			Vector v = new Vector();
			for (int i = 1; i < args.length; i++) {
				File f = new File(args[i]);
				if (f.exists()) {
					v.add(new FileInputStream(args[i]));

				} else {
					System.out.println(args[i] + " - 존재하지 않는 파일입니다. ");
					System.exit(0);

				}

			}
			SequenceInputStream input = new SequenceInputStream(v.elements());
			FileOutputStream output = new FileOutputStream(args[0]);

			int data = 0;
			while ((data = input.read()) != -1) {
				output.write(data);

			}

		} catch (IOException e) {
		}

	}

}