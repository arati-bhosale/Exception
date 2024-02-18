package com.pro.exception;

public class Excp {

	public static void main(String[] args) {
		
		int res =0;
		 
		try {
			res =10/0;
		}
		catch( Exception e) {                // this is parent and parent least       
		System.out.println("Exception occ");
		}
//		catch(NullPointerException n) {     //this is child and child first                  
//			System.out.println("(NullPointerException occ");
//		}
		
		finally {
			System.out.println(" finally block");
		}
		
	}
}
