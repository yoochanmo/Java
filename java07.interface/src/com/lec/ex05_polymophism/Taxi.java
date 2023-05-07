package com.lec.ex05_polymophism;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시를 운전합니다.");
	}

}
