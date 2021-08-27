/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myinterface m=(myinterface) new Demo();
		m.add();
		m.sub();
		m.mul();
		m.div();
	}
}
	
	interface myinterface
	{
		
	
	final int i=89;
	final int j=32;
	public void add();
	public void sub();
	public void mul();
	public void div();
	

	}//end myinterface
	//demo class implements myinterface
	
	class Demo implements myinterface
	{
		public void add()
		{
			System.out.println("addition is "+(i+j));
		}
		public void sub()
		{
			System.out.println("substraction is "+(i-j));
		
		}
		public void mul()
		{
			System.out.println("multipilcation is "+(i*j));
		}
		public void div()
		{
			System.out.println("division is "+(i/j));
			
		}
	}//end demo

