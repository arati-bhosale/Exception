package com.pro.exception;

public class ThrowsDemo {

	public static void main(String[] args)  {
		
		try {
			add();
		}
		catch(ArithmeticException e) {
			
			System.out.println("Arith excep");
		}
		System.out.println("ended");
	}

	private static void add() throws ArithmeticException ,NullPointerException {
		
		int i =10;
		int j =0;
		int res;
		
		res =i/j;
	}
	
}
