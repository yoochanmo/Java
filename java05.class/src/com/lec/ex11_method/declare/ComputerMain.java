package com.lec.ex11_method.declare;

public class ComputerMain {

	public static void main(String[] args) {
		
		
		Computer com1 = new Computer();
		System.out.println("1 ~ 10까지의 합 = " + com1.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1 ~ 5까지의 합 = " + com1.add(1,2,3,4,5));
		System.out.println();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("1 ~ 10까지의 합 = " + com1.add(arr));
		System.out.println("1 ~ 5까지의 합 = " + com1.add(new int[] {1,2,3,4,5}));
		System.out.println();
		
		System.out.println("1 ~ 10까지의 합 = " + com1.add1(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1 ~ 5까지의 합 = " + com1.add1(1,2,3,4,5));
		System.out.println("1 ~ 3까지의 합 = " + com1.add1(1,2,3));
		System.out.println("1 ~ 11까지의 합 = " + com1.add1(1,2,3,4,5,6,7,8,9,10,11));
		System.out.println("1 ~ 20까지의 합 = " + com1.add1(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		
	}

}
