package com.pro.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
	 System.out.println("1");	
		int i=10;
		int j =0;
		int res;
		try {
			System.out.println("2");
			
//			System.exit(0);
			res =i/j;
			System.exit(0);
			System.out.println("3");
		}
		catch(ArithmeticException d){
			
			System.out.println("4");
//			System.exit(0);
			System.out.println(d);
			System.out.println("5");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
