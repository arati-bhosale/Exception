package com.pro.exception;

public class ExceptionDemo1 {

	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[5];    
              
              System.out.println(a[10]);  
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs"); 
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                 System.out.println(e);  
                }             
             System.out.println("rest of the code");    
  }  
}
