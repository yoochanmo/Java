package com.lec.robot.v3_추상화;

public abstract class Robot {

	// 추상메서드
	// actionFly actionMissile 
	
	public String action;
	public int qty;
	
	public Robot(int qty) {
		this.qty = qty;
	}
	
	
	public void shape() {
		System.out.println("Chape로봇입니다 .머리 몸통 팔 다리가 있습니다.");
	};
	
	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun() {
		System.out.println("뜀뛰기 쌉가능합니다.");
	}
	
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();
		
	}

