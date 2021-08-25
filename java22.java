/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java22 obj=new java22();
		//Method overloading
		System.out.println(obj.mul(10,20, 0));
		System.out.println(obj.mul(45,20,45));
		System.out.println(obj.mul(70,28,76,87));
		////method overriding
		arithmatic_operation obj1=new arithmatic_operation();
		int sub;
		arithmatic_operation obj2=new sub_class();
		sub_class obj3= new sub_class();
		obj1.print();
		obj2.print();
		obj3.print();
		

	}

	private char[] mul(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] mul(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}// end main

}//end class

//super class
class arithmatic_operation
{
	int mul(int a,int b)
	{
		return(a*b);
	}
	int mul(int a,int b,int c)
	{
		return(a*b*c);
	}
	int mul(int a, int b, int c , int d )
	{
		return(a*b*c*d);
	}
	void print()
	{
		System.out.println("its from superclass");
	}
}//end arithmatic_operation

//subclass

class sub_class extends arithmatic_operation{
	void print()
	{
		System.out.println("its from subclass");
	}
}//end sub_class