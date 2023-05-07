package com.lec.exercise.exercise;

import java.*;
import java.text.*;
import java.util.Date;

public class Exercise10_5 {
	
	/* 

	 * (1)getDayDiff 메서드를 작성하시오.

	 */ 
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		int ret = 0;
		
		try {
			Date date1 = format.parse(yyyymmdd1);
			Date date2 = format.parse(yyyymmdd2);
			
			long diff = (date1.getTime() - date2.getTime()) / (24*60*60*1000);
			ret = (int)Math.abs(diff);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103","20010101")); 

		System.out.println(getDayDiff("20010103","20010103")); 

		System.out.println(getDayDiff("20010103","20010103")); 

	}



	}


