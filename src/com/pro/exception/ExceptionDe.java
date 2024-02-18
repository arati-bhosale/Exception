package com.pro.exception;

public class ExceptionDe {

	public static void main(String[] args) {
		
		int i[] = new int [3];
		
		try {
			System.out.println(i[4]);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Index Out Of Bounds Exception Occurs");
		    System.out.println(a);
		}
		
		catch(Exception e){
			System.out.println("Exception Occurs ");
			System.out.println(e);
		}
	}
}
