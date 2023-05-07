package com.lec.robot.v7_생성자;

import com.lec.robot.v4_인터페이스.inter.InterFly;
import com.lec.robot.v4_인터페이스.inter.InterMissile;
import com.lec.robot.v4_인터페이스.inter.InterSword;

public class SuperRobot extends Robot {

	public SuperRobot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		super(name, qty, fly, missile, sword);
		
	}

}
