/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class Que4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the percentage format of 30% is 30/100 in fraction
		int numerator=30;
		int denominator=100;
		//reduce the fraction by taking common factor of the numerator and denominator
		int common_fac=10;
		int nume=numerator/common_fac;
		int deno=denominator/common_fac;
		System.out.println("the fraction of 30% is "+ nume+ "/" +deno);
		
	
	}

}
