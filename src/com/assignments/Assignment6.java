package com.assignments;

public class Assignment6 {

	public static void main(String[] args) {

	/*	A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
o If the credit score is above 750, the loan is automatically approved.
o If the credit score is between 650 and 750, additional checks are performed.
o If the credit score is below 650, the loan is denied.
2. Income:
o For credit scores between 650 and 750, the customer’s income must be at least $50,000
for the loan to be considered.

3. Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied. */
		
		int creditScore= 660;
		
		int customerincome = 500000;
		
		boolean employeeStatus = true;
		
		int dtiRatio = 45;
		
		
		if(creditScore > 751) 
		{
			
			System.out.println("credit score is above 750, the loan is automatically approved.");
		}
		
		else if(creditScore>=650 && creditScore <=750) 
		{
			
			if(customerincome >=500000) 
			{
				
				if (employeeStatus == true)
				{
					
					if(dtiRatio <= 40)
					{
			           System.out.println("credit score is between 650 and 750, additional checks are performed.");
					}
					else 
					{
						System.out.println("DTI ratio greater than 40 loan denied");
					}
				}
				
				else 
				{
					
					System.out.println("customer is outsider loan denied");
				}
			}
			
			else 
			{
				System.out.println("Customer income less than 50000");
			}
			
			}
		
		   else if(creditScore <650) 
			   
		   {
			System.out.println("credit score is below 650, the loan is denied.");
		   }
		
		
	}

}
