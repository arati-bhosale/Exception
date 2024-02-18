package com.pro.exception;

public class ExceptionReturn {

	public static void main(String[] args) {
		
		int res =extracted();
		System.out.println(res);
	}

	private static int extracted() {
		
		try {
			int i=10;
			int j=0;
			int res;
			res = i/j;
			return 50;
		}
		catch (ArithmeticException ex) {
			System.out.println("Exception handled!!!");
			System.out.println(ex.getMessage());
			return 100;
		}
		
		catch(Exception e) {
			System.out.println("inside exception");
			return 400;
		}
		finally {
			System.out.println("inside finally!!!!");
			return 500;
		}
		
	
	}
}
