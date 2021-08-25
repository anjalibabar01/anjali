/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class Que5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=340;//length of train;
		int len_tunnel=160;//length of tunnel
		int distance= len+len_tunnel;//total distance to be covered
		double time;
		double speed=45.0;
		/*
		 * we have speed in km/hr and length of train and tunnel given in m unit
		 * so we need to covert it
		 * 45 km/hr=45*1000/3600 m/s
		 * speed=25/2 m/s
		 */
		
		speed=(double) speed*(1000/3600.0);
		time=distance/speed;
		System.out.println("time required "+ time+" sec");
		

	}

}
