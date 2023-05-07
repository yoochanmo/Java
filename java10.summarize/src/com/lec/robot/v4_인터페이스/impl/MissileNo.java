package com.lec.robot.v4_인터페이스.impl;

import com.lec.robot.v4_인터페이스.inter.InterMissile;

public class MissileNo implements InterMissile {

	@Override
	public void missile() {
		System.out.println("미사일을 쏠 수가 없습니다!");		
	}

}
