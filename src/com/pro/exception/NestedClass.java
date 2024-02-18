package com.pro.exception;

public class NestedClass {

	public static void main(String[] args) {
		
		int res;
		int num[] = {10,20,30,40};
		
//		try {
//		//	res = 10/0;
//			
//			try {
//			res = num[5];
//			}
//			catch(ArithmeticException e){
//				System.out.println("inner catch");
//			}
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("outer catch");
//		}
		
//<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>		
		
		try {
			res = 10/0;
//			System.out.println("ARaTi");
//			System.exit(0);
			try {
			res = num[5];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("inner catch");
			}
		}
		
		catch(ArithmeticException e1) {
			
			System.out.println("outer catch");
		}
		
		
		
	}
}
