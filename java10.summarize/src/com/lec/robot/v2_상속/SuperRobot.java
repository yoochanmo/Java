package com.lec.robot.v2_상속;

public class SuperRobot extends Robot{

	public SuperRobot(int qty) {
		super(qty);
	}
	public void actionFly() {System.out.println("하늘을 날아요");}
	public void actionSword() {System.out.println("광선검 사용가능해요");}
	public void actionMissile() {System.out.println("미사일 사용가능해요");}
	@Override
	public void shape() {
		System.out.println("SuperRobot로봇입니다 팔, 다리, 머리, 몸통이 있습니다. ");
	}
}
