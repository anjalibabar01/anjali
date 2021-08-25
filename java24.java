/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
//super class java
class java{
	static String company="java";
	int noOfEmployees=90000;
	void print ()
	{
		System.out.println("welcome to "+company);
		System.out.println("we have "+noOfEmployees+" no of employees .");
		
	}
	void work() {
		System.out.println("we are workin in java");
		
	}
}
/*
 * single inheritance
 * super class-java
 * child class-development*/

class development extends java{
	int noOfEmployees=8000;
	void print() {
		System.out.println("we have "+noOfEmployees+" no of employees in development department.");
	}
	void work() {
		System.out.println("we are working in development department of "+company);	
	}
}
/*
 * hierarchical inheritance
 * super clalss-java
 * child class- design
 */

class design extends java{
	int noOfEmployees=12000;
	void print() {
		System.out.println("we have "+noOfEmployees+" no of employees in design department.");
	}
	void work() {
		System.out.println("we are working in design department of "+company);
		
	}
}

/*
 * multilevel inheritance
 * first super class-java
 * second super class-design
 * child class-testing
 */

class testing extends design{
	int noOfEmployees=19000;
	void print()
	{
		System.out.println("we are working in testing department of "+company);
		
	}
}

/*
 * single inheritance
 * super class-java
 * child- sales
 */

class sales extends java{
	int noOfEmployees=18000;
	void print() {
		System.out.println("we are work in sales department of "+company);
	}
}
/*
 * multilevel inheritance
 * first super class-java
 * second super class-sales
 * child class-account
 */

class account extends sales{
	int noOfEmployees=38000;
	void print()
	{
		System.out.println("we are working in account departmrnt of "+company);
		
	}
}

public class java24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java j1=new java();
		j1.print();
		j1.work();
		
		development d1=new development();
		d1.work();
		d1.print();
		
		design ds=new design();
		ds.print();
		ds.work();
		
		testing t1=new testing();
		t1.print();
		t1.work();
		
		sales s1=new sales();
		s1.print();
		s1.work();
		
		account ac=new account();
		ac.work();
		ac.print();
		
	}

}
