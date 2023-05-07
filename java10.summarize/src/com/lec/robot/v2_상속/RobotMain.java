package com.lec.robot.v2_상속;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("========= Robot v2.0 상속 ========");
		CheapRobot cheapRobot = new CheapRobot(10);
		cheapRobot.shape();
		cheapRobot.actionRun();
		cheapRobot.actionWalk();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println("CheapRobot의 재고수량은 = " + cheapRobot.qty + " 개 입니다." );
		System.out.println();
		
		
		StandardRobot standardRobot = new StandardRobot(5);
		standardRobot.shape();
		standardRobot.actionRun();
		standardRobot.actionWalk();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println("StandardRobot의 재고수량은 = " + standardRobot.qty + " 개 입니다." );
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot(7);
		superRobot.shape();
		superRobot.actionRun();
		superRobot.actionWalk();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println("SuperRobot의 재고수량은 = " + superRobot.qty + " 개 입니다." );
		System.out.println();
	}

}
