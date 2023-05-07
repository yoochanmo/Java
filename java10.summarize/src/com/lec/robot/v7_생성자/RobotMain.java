package com.lec.robot.v7_생성자;

import com.lec.robot.v4_인터페이스.impl.*;
import com.lec.robot.v4_인터페이스.inter.*;


public class RobotMain {

	public static void main(String[] args) {

		System.out.println("=== Robot V7.0 생성자 ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap", 5, new FlyNo(), new MissileNo(), new SwordNo());
		robot.makeRobot();
		
		robot = new StandardRobot("Standard", 5, new FlyYes(), new MissileYes(), new SwordLaser());
		robot.makeRobot();
		
		robot = new SuperRobot("Super", 5, new FlyYes(), new 탄도미사일(), new UltraJJangSword());
		robot.makeRobot();
		
				
	}
}
