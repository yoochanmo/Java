package com.lec.ex11_method.declare;

public class Computer {

	int add(int a , int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		return a+b+c+d+e+f+g+h+i+j;
	}
	int add(int a , int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	int add(int[]arr) {
		int sum = 0;
		for(int x : arr) {
			sum += x;
		}
		return sum;
	}
	//int[] = int...x와 동일의미
//	int add(int...x) {
//		return 0;
//	}
	int add1(int...arr) {
		int sum = 0;
		for(int x : arr) {
			sum += x;
		}
		return sum;
	}

}
