/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100/0;
		}
			
       catch(ArithmeticException e)
		{
    	  System.out.println("exeption occured:"+e);
    	  System.out.println("can not divide by zero");
		}
	}

}
