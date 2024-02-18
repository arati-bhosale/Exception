package com.pro.exception;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		List al =new ArrayList();
		al.add(10);
		al.add(20);
		
		try {
			Iterator itr = al.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				al.add(30);
			}
		}
		catch(ConcurrentModificationException e1) {
			
			System.out.println("CME Occurs");
			System.out.println(e1);
		}
		
		catch(Exception e) {
			System.out.println("Exception occurs");
			}
		
		finally {
			System.out.println("Finally Block");
		}
	}
}

