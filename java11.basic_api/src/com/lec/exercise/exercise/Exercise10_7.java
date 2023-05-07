package com.lec.exercise.exercise;

import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

public class Exercise10_7 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020,11, 2);
		System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY)));

	}

}
