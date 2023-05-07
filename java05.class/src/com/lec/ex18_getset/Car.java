package com.lec.ex18_getset;

public class Car {
	private int speed = 0;
	private boolean stop;
	
	public void setSpeed(int speed ) {
		if(speed > 100) {
			System.out.println(speed + " [ 위반 ]제한속도를 초과했어");
			this.speed = 100;
		}else {
			if(speed < 30) {
				System.out.println(speed + " [ 위반 ]제한속도가 너무 느려 기어가니");
				this.speed = speed;
			}else {
				this.speed = speed;
			}

		
		}
		
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

	public void setStop() {
		System.out.println("멈춰");
		if(this.speed < 30) {
			this.stop = true;
		}else {
			System.out.println("현재속도는 " + this.speed + "km/h");
			System.out.println("정지하기에는 속도가 너무 빨라");
			System.out.println("줄여");
		}
		
	}
	public void isStop(boolean stop) {
		this.stop = stop;
	}
	public int getspeed() {
		
		return this.speed;
	}

	public boolean getStop() {
		
		return this.stop;
	}
	
	
	
}
