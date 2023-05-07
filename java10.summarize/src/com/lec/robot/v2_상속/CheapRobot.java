package com.lec.robot.v2_상속;

public class CheapRobot extends Robot {

	public CheapRobot(int qty) {
		super(qty);
	}
	@Override
	public void shape() {
		System.out.println("CheapRobot로봇입니다  팔, 다리, 머리, 몸통이 있습니다");
	}
	public void actionFly() {System.out.println("하늘을 못날아요");}
	public void actionSword() {System.out.println("검이 없어요");}
	public void actionMissile() {System.out.println("미사일 없어요");}
}
