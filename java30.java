package com.java;

class AgeException extends Exception{
	AgeException(String str)
	{
		//calling the constructor of parent exception
		super(str);
		
	}
}
public class java30{
	private static final char[] Exception = null;

	//main method
	public static void main(String[] args) {
		//todo auto-generated method stub
		
		try {
			//calling the method
			validate(16);
			
		}
		catch(AgeException e) {
			//printing the messege from ageexception object
			System.out.println("Exception occured: "+e);
					
					
		}
	}
	
	//method to check age
	static void validate(int age)throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("you are not eligible for vote");
		}
		else
		{
			System.out.println("you are eligible for vote");
			
		}
	}
}

