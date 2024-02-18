package com.pro.exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		try {
			int i=10;
			int j=0;
			int res;
//			res =i/j;
			
			try {
				int s[] =new int [4];
				System.out.println(s[5]);
			}
			catch(ArithmeticException e1) {
			System.out.println("Array Index OutOfBoundsException occurs");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
	}
}
