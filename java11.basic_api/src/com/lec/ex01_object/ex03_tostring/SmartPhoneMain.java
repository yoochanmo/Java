package com.lec.ex01_object.ex03_tostring;

import java.util.Date;

public class SmartPhoneMain {

	public static void main(String[] args) {
	

		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date date1 = new Date();
		System.out.println(date1.toString());
		
		SmartPhone smartPhone = new SmartPhone("아이폰","ios");
		System.out.println(smartPhone.toString());
		
		
		
		
		
	}

}
