package com.lec.ex02.implement;

public class Audio implements RemoteControl {

	private int volumn;
	@Override
	public void turnOn() {
		System.out.println("Audio Power ON!");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Power Off!");
		
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


