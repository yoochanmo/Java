package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {

		System.out.println("=== Robot V4.0 (인터페이스) ===");
		System.out.println();

		CheapRobot cheapRobot = new CheapRobot("Cheap", 5); 
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.setFly(new FlyNo());
		cheapRobot.actionFly();
		cheapRobot.setMissile(new MissileYes());
		cheapRobot.actionMissile();
		cheapRobot.setSword(new SwordNo());
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name + "Robot의 재고수량 = " + cheapRobot.qty);
		System.out.println();		
		
		StandardRobot standardRobot = new StandardRobot("Standard", 5); 
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.setFly(new FlyNo());
		standardRobot.actionFly();
		standardRobot.setMissile(new 탄도미사일());
		standardRobot.actionMissile();
		standardRobot.setSword(new SwordLaser());
		standardRobot.actionSword();
		System.out.println(standardRobot.name + "Robot의 재고수량 = " + standardRobot.qty);
		System.out.println();		
		
		SuperRobot superRobot = new SuperRobot("Super", 5); 
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setMissile(new MissileYes());
		superRobot.actionMissile();
		superRobot.setSword(new UltraJJangSword());
		superRobot.actionSword();
		System.out.println(superRobot.name + "Robot의 재고수량 = " + superRobot.qty);
		System.out.println();		

	}

}
