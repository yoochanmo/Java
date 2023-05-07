package com.lec.exercise.exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {

	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1997, 10, 29);
		LocalDate now = LocalDate.now();
		
		long days = birthDay.until(now, ChronoUnit.DAYS);
		
		System.out.println("태어난 날 = " + birthDay);
		System.out.println("투데이    = " + now);
		System.out.println(days + "일 동안 생존중 ");

	}

}
