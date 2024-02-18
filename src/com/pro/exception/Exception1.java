package com.pro.exception;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
			int res =10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
}
