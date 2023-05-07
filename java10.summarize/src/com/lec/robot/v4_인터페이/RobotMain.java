package com.lec.robot.v4_인터페이;

import com.lec.robot.v4_인터페이.impl.FlyNo;
import com.lec.robot.v4_인터페이.impl.FlyYes;
import com.lec.robot.v4_인터페이.impl.MissileNo;
import com.lec.robot.v4_인터페이.impl.MissileYes;
import com.lec.robot.v4_인터페이.impl.SwordLaser;
import com.lec.robot.v4_인터페이.impl.SwordNo;
import com.lec.robot.v4_인터페이.impl.SwordWood;
import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {

		System.out.println("=== Robot V4.0 (인터페이스) ===");
		System.out.println();

		CheapRobot cheapRobot = new CheapRobot("CheapRobot", 5, new FlyNo(), new MissileNo(), new SwordNo());
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name + "Robot의 재고수량 = " + cheapRobot.qty);
		System.out.println();

		StandardRobot standardRobot = new StandardRobot("StandardRobot", 2, new FlyNo(), new MissileNo(), new SwordWood());
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println(standardRobot.name + "Robot의 재고수량 = " + standardRobot.qty);
		System.out.println();

		SuperRobot superRobot = new SuperRobot("SuperRobot", 3, new FlyYes(), new MissileYes(), new SwordLaser());
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println(superRobot.name + "Robot의 재고수량 = " + superRobot.qty);
		System.out.println();

	}

}
