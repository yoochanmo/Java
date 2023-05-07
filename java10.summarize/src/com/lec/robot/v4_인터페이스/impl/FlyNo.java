package com.lec.robot.v4_인터페이스.impl;

import com.lec.robot.v4_인터페이스.inter.InterFly;

public class FlyNo implements InterFly {

	@Override
	public void fly() {
		System.out.println("날 수가 없습니다!!");
	}

}
