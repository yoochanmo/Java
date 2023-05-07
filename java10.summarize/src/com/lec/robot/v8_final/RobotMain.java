package com.lec.robot.v8_final;


import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {
	
			System.out.println("==========Robot V8.0(Final)=========");
			System.out.println();
			
			Robot robot = new Robot();
			robot.makeRobot("CheapRobot", 100, new FlyNo(), new MissileNo(), new SwordNo());
			System.out.println(robot.name +"의 현재 수량 = " + robot.qty + "대");
			System.out.println();
			robot.makeRobot("StandardRobot", 25, new FlyNo(), new MissileNo(), new SwordWood());
			System.out.println(robot.name +"의 현재 수량 = " + robot.qty + "대");
			System.out.println();
			robot.makeRobot("SuperSuperRobot", 1250, new FlyYes(), new 탄도미사일(), new UltraJJangSword());
			System.out.println(robot.name +"의 현재 수량 = " + robot.qty + "대");
			
	
	
			
			// 실습
			// 1 . v4에서 setter을 없애는 로직
			// 2 . v8에서 method 다형성(makeRobot(InterFly,InterMissile, Inter Sword))
			
	}

}
