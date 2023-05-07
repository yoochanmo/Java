package com.lec.robot.v7_생성자;

import com.lec.robot.v4_인터페이스.inter.*;


public class CheapRobot extends Robot {

	public CheapRobot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		super(name, qty, fly, missile, sword);
		
	}

}
