package com.lec.ex03_interface;

public class ButtonMain {

	public static void main(String[] args) {
		
		Button button = new Button();
		Call call = new Call();
		button.setListner(call);
		button.click();
		
		button.setListner(new Message());
		button.click();
		
		button.setListner(new YouTube());
		button.click();
	}

}
