package com.lec.robot.v5_extends;

import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V5.0 (인터페이스, extrends) ===");
		System.out.println();

		Robot robot = null;
		
		robot = new CheapRobot("Cheap", 5);
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileNo());
		robot.actionMissile();
		robot.setSword(new SwordNo());
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();
		
		robot = new StandardRobot("Standard", 10);
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new SwordLaser());
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();
		
		robot = new SuperRobot("Super", 10);
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyYes());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new UltraJJangSword());
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();		
	}

}
