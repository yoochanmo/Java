package com.lec.ex05_user;

public class AccountMain {

	public static void main(String[] args) throws 잔액부족 {
		
		Account account = new Account();
		
		account.예금(100);
		System.out.println("현재 계좌 잔액은 " +account.getBalance() +" 원 입니다.");
		
		account.출금(220);
		System.out.println("현재 계좌 잔액은 " +account.getBalance() +" 원 입니다.");
		
		
		
		// throw new 잔액부족("현재잔액이 부족합니다.");
	}

}
