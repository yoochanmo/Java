package com.lec.ex05_user;

public class Account {

		private int balance;

		public int getBalance() {
			return balance;
		}
		
		void 예금(int money) {
			this.balance += money;
		}


//		public void 출금(int money) {
//			if(balance < money) {
//				System.out.println("잔액이 부족합니다.");
//			}else {
//			this.balance -= money;
//			}
//		}
		public void 출금(int money) throws 잔액부족 {
			if(balance < money) {
				//throw new 잔액부족();
				throw new 잔액부족("잔액이 부족합니다. " + (money - this.balance) + "원이 부족합니다.");
			}else {
				this.balance -= money;
			}
		}
}
