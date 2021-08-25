/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int principal =161258; //amount
        double rate =0.05d;
        int t1=3; //3 years
        int t2=5; //5 years
        rate=rate/(12*100);
        //EMI of 3 years of amount 161258
        t1=t1*12;
        double EMI = (principal*rate*Math.pow(1+rate, t1))/(Math.pow(1+rate,t1)-1);
        System.out.println("EMI of 3 year is "+EMI);
        
        //EMI of 5 years of amount 161258
        
        t2=t2*12;
        EMI=(principal*rate*Math.pow(1+rate,t2))/(Math.pow(1+rate,t2)-1);
        System.out.println("EMI of 5 years is "+EMI);
        
        
	}

}
