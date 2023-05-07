package com.lec.exercise.exercise;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10_8 {

	public static void main(String[] args) {

		ZonedDateTime zdt = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime zdtNY = ZonedDateTime.now().withZoneSameInstant(nyId);

		System.out.println("대한민국 현재시간 : " + zdt);
		System.out.println("미국(뉴욕)의 현재시간 : " + zdtNY);

		long sec1 = zdt.getOffset().getTotalSeconds();
		long sec2 = zdtNY.getOffset().getTotalSeconds();
		long diff = (sec1 - sec2) / 3600;

		System.out.println("sec1 = " + sec1);
		System.out.println("sec2 = " + sec2);
		System.out.printf("대한민국과 미국(뉴욕)의 시차는 " + diff + "시간차이");

	}

}
