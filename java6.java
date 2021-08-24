/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java6 {

	/**
	 * @param args
	 */
	int a;
	static {System.out.println("1st static block");}
	
	{
		System.out.println("executing instance block");
		a=20;
	}
	
	static{System.out.println("executing after 1st static block");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java6 ob = new java6();
		System.out.println("value of a="+ ob.a);
		

	}

}
