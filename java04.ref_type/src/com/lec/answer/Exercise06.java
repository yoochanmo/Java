package com.lec.answer;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 1 .
		for(int i=1;i<=5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("------------------------");
		
		// 2 .
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");	
		
		// 3 . 
		for(int i=5; i>=0; i--) { 
		    for(int j=i-1; j>=0; j--) { 
		    	System.out.print(" "); 
		    } 
		    for(int k=1; k<=5-i; k++) { 
		    	System.out.print("*"); 
		    } 
		    System.out.println(); 
		}
		System.out.println("------------------------");	
		
		// 4 . 
		for(int i = 1; i <= 5; i++) { 
		    for(int k = 0; k < i; k++) { 
		    	System.out.print(" "); 
		    } 
		    for(int j = 5; j > i - 1; j--) {  
		    	System.out.print("*"); 
		    } 
		    System.out.println(); 
		}
		System.out.println("------------------------");	

		// 5 . 
		
		for(int i=1; i<=5; i++) { 
		    for(int k=1; k<=5-i; k++) { 
		    	System.out.print(" "); 
		    } 
		    for(int j=1; j<=i*2-1; j++) { 
		    	System.out.print("*"); 
		    } 
		    System.out.println(); 
		}
		System.out.println("------------------------");	

		// 6 . 
		for (int i=0; i<= 4; i++) {
		    for (int j=0; j< i; j++) {
		        System.out.print(" ");
		    }
		    for (int k=i; k<=2*4-i; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		System.out.println("------------------------");	
		
		// 7 . 
		for(int i=1; i<=5; i++) { 
		    for(int k=1; k<=5-i; k++) { 
		    	System.out.print(" "); 
		    } 
		    for(int j=1; j<=i*2-1; j++) { 
		    	System.out.print("*"); 
		    } 
		    System.out.println(); 
		}
		for (int i=0; i<= 4; i++) {
		    for (int j=0; j< i; j++) {
		        System.out.print(" ");
		    }
		    for (int k=i; k<=2*4-i; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}


