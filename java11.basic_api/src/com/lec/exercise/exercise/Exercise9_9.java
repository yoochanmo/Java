package com.lec.exercise.exercise;

public class Exercise9_9 {

	/* (1) delChar 메서드를 작성하시오 . */
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);
		for (int i = 0; i < delCh.length(); i++) {
			int pos = 0;
			while (pos < src.length()) {
				int newPos = src.indexOf(delCh.charAt(i), pos);
				if (newPos == -1)
					break;
				else {
					sb.deleteCharAt(newPos);
					src = sb.toString();
				}
				pos = newPos;
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println("(1!2@3^4~5)" + " -> "

				+ delChar("(1!2@3^4~5)", "~!@#$%^&*()"));

		System.out.println("(1 2 3 4\t5)" + " -> "

				+ delChar("(1 2 3 4\t5)", " \t"));

	}

}
