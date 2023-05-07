package com.lec.robot.v3_추상화;

public class CheapRobot extends Robot {





	@Override
	public void shape() {
		System.out.println("Chape 로봇입니다 머리 몸통 팔 다리가 있습니다.");
	}

	public CheapRobot(int qty) {
		super(qty);
	}

	@Override
	public void actionFly() {
		System.out.println("하늘을 못날아요");
		
	}

	@Override
	public void actionMissile() {
		System.out.println("미사일이 없어영");
		
	}

	@Override
	public void actionSword() {
		System.out.println("검이 없어영");
	}

}
