package com.pro.exception;

public class Excp1 {

	public static void main(String[] args) {
		int a[] = {10,20};
		
		try {
			System.out.println(a[2]=20);
		}
		catch(Exception e1) {
			System.out.println("hello"); 
		}
		
//		catch(Exception e2) {
//			System.out.println("hello"); 
//		}
	}
}
