/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
class methods {

	/**
	 * @param args
	 */
	int a;
	int b;
	int sum;
	float mul;
	float div;
	static int mod;
	//instance mathod
	void initialize()
	{
		a=10;
		b=20;
	}
	//without return type and argument
	void woutrearg()
	{
		initialize();//invoking instance method inside instance method
		sum=a+b;
		System.out.println("addition is "+sum);
	}
	//with argument and without return type
	void witharg(int c , int d)
	{
		mul=c*d;
	    System.out.println("multiplication is "+mul);
	}
	//with argument and return type
	float withrearg (Float x,Float y)
	{
		div=x/y;
		return div;
	
	}
	//static method with return type and with argument
	
	static int withrearg(int p, int q)
	{ 
		mod=p%q;
		return mod;
	}
	static void printmethod()
	{
		int ret=withrearg(50,10); //invoking static method inside static method
		System.out.println("mod is "+ret);
	}
}

 public class java21{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        methods obj = new methods();
        obj.woutrearg();
        obj.witharg(65,12);
        float retdiv=obj.withrearg(52,3);
        System.out.println("division is "+retdiv);
        methods.printmethod();
        
	}//end main

}//end java21
