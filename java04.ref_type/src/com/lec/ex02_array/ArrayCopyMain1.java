package com.lec.ex02_array;

public class ArrayCopyMain1 {

	public static void main(String[] args) {
		// 배열의 복사
		// 1 . 참조타입인 배열
		String[][] name = {{"거미","나얼"},{"소향","손흥민","이강인"}};
		for(int i=0; i<name.length;i++) {
			for(int j=0; j<name[i].length;j++) {
				System.out.println("name[" + i + "][" + j + "] =" + name[i][j]);
			}
		}
		System.out.println();
		
		
		// 2 . 배열복사 - 얕은복사(shallow copy)
		String[][] name2 = name;
		for(int i=0; i<name2.length;i++) {
			for(int j=0; j<name2[i].length;j++) {
				System.out.println("name2[" + i + "][" + j + "] =" + name2[i][j]);
			}
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
		name[0][0] = "박정현";
		name2[1][2] = "김민재";
		for(int i=0; i<name.length;i++) {
			for(int j=0; j<name[i].length;j++) {
				System.out.println("name[" + i + "][" + j + "] =" + name[i][j]);
			}
		}
		System.out.println();
//		for(int i=0; i<name2.length;i++) {
//			for(int j=0; j<name2[i].length;j++) {
//				System.out.println("name2[" + i + "][" + j + "] =" + name2[i][j]);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
