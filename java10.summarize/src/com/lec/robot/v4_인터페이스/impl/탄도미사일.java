package com.lec.robot.v4_인터페이스.impl;

import com.lec.robot.v4_인터페이스.inter.InterMissile;

public class 탄도미사일 implements InterMissile {

	@Override
	public void missile() {
		System.out.println("탄도미사일을 쏠 수가 있습니다!!");
	}

}
