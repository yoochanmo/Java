package com.lec.ex05_polymophism;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스를 운전합니다.");
	}

}
