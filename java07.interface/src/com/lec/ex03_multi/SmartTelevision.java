package com.lec.ex03_multi;

import com.lec.ex02.implement.RemoteControl;

public class SmartTelevision implements RemoteControl,Searchable{

	private int volumn;
	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Smart Tv를 Power On");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Tv를 Power Off");
		
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		}else if(volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		}else {
			this.volumn = volumn;
		}
		System.out.println("현재 TV볼륨은 " + this.volumn + "입니다.");
		
	}
		
	}


