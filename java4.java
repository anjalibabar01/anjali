/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java4 {

	/**
	 * @param args
	 */
	static string s;
	static int a;
	static double d;
	static float f;
	int score=54;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s); //error:string cannot be resolved to a type
		System.out.println(a);
		System.out.println(d);
		System.out.println(f);
		System.out.println(score); //error:cannot make a static reference to non-static field score

	}

}
