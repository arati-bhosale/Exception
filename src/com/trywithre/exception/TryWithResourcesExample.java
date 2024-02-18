package com.trywithre.exception;

//Our own TryWithResources
public class TryWithResourcesExample {

	public static void main(String[] args) throws Exception {
		 
	     try (Door door = new Door()) {
	       door.swing();
	     } 
	     
	     catch (Exception e) { /* do something */ }    //
	                                                   //
	      finally { /* do something */ }               //Optional catch and finally block
	                                                   //
	   }                                               
}

class Door implements AutoCloseable {

	  public void swing() {
	     System.out.print("The door is swinging. ");
	   }
	 
	   public void close() {
	     System.out.print("Now the door is closed. ");
	  }
	 }
	 
