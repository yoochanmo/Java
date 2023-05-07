package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.inter.InterFly;

public abstract class Robot {
	
	public String name;
	public int qty;
	
	public Robot(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	public void shape() { System.out.println(this.name + "Robot입니다! 팔, 다리, 머리, 몸통이 있습니다.");}
	public void actionWalk() { System.out.println("걸을 수가 있습니다"); }
	public void actionRun() { System.out.println("달릴 수가 있습니다"); }

	
	// 추상메서드
	// actionFly, actionMissile, actionSword
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();
}
