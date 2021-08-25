/**
 * 
 */
package com.java;

/**
 * @author Anjali babar
 *
 */
public class java17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principal=161258;
		float rate=5.0f;
		int months=3;
		float simpleInterest, compoundInterest;
		
		simpleInterest=((principal*rate*months) /(100*12));
		System.out.println("monthly simple interest on amount "+principal+" and "+months+" month is: "+simpleInterest);
		
		//principal=161258,year=1,rate=5%
		//amount=p*(1+(0.05/12)^12) since, a=p*[1+(R/n)]^ nt we are compounding monthly so n=12
		//CI=amount-principal
		

		Float amount= (Float) (principal*((math.pow( (1+(0.05/12)) , 12) )));
        compoundInterest=(amount-principal);
        System.out.println("monthly compound interst on amount "+principal+" and months "+months+" is: "+compoundInterest);
		
				
	}

}
