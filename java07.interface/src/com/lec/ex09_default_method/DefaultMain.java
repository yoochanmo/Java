package com.lec.ex09_default_method;

public class DefaultMain {

	public static void main(String[] args) {
		
		MyInterFace mia = new MyClassA();
		mia.method1();
		mia.method2();
		mia.method3();
		System.out.println();
		MyInterFace mib = new MyClassB();
		mib.method1();
		mib.method2();
		mib.method3();
	}

}
