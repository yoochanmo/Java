package com.lec.ex03_interface;

import com.lec.ex03_interface.Button.OnClickListner;

public class Button {

	// 중첩인터페이스
	interface OnClickListner{
		void OnClick();
	}
	
	OnClickListner listner;
	
	public void setListner(OnClickListner listner) {
		this.listner = listner; 
	}
	
	void click() {
		listner.OnClick();
	}
}

class Call implements OnClickListner{

	@Override
	public void OnClick() {
		System.out.println("전화 좀 받아봐");
	}}
class Message implements OnClickListner{

	@Override
	public void OnClick() {
	System.out.println("문자를 보냄.");
		
	}}
