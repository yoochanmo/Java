package com.lec.ex05_polymophism;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.driver(new Bus());
		driver.driver(new Taxi());
		driver.driver(new 오토바이());
		driver.driver(new 자전거());
		driver.driver(new 킥보드());

	}

}

class 오토바이 implements Vehicle{

	@Override
	public void run() {
		System.out.println("오토바이 소음공해입니다.");
		
	}
}
class 자전거 implements Vehicle{

	@Override
	public void run() {
		System.out.println("자라니입니다.");
	}
}
class 킥보드 implements Vehicle{

	@Override
	public void run() {
		System.out.println("킥라니입니다.");
		
	}
}

