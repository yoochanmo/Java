package com.lec.ex13_static;

public class TelevisionMain {

	public static void main(String[] args) {
		
		
		System.out.println(Television.company);
		System.out.println(Television.model);
		System.out.println(Television.info);

		Television.info = Television.company + " *** " + Television.model;
		System.out.println(Television.info);
		
		
	}

}
