package com.assignments;

public class Assignment7duplicate {

	public static void main(String[] args) {

		 int [] transactions = {5000,12000,-200,-300,7000,-11000};
	        
	        int totalCreditCount = 0;
	        int totalDebitCount = 0;
	        int totalCreditAmount = 0;
	        int totalDebitAmount = 0;
	        int suspeciousCount = 0;
	        int accountBalance = 0;
	        
	        for(int amount : transactions) {
	        	
	        	accountBalance = accountBalance+amount;
	        	
	        	if(amount > 0) {
	        		totalCreditCount++;
	        		totalCreditAmount += amount;
	        		if(amount > 10000) {
	        			
	        			System.out.println("suspecious transaction: "+ amount);
	        			suspeciousCount++;
	        		}
	        		
	        	}
	        	else {
	        		if(amount < -10000) {
	        			System.out.println("suspecious transaction: "+ amount);
	        		}
	        		totalDebitCount ++; 
	        		totalDebitAmount -= amount;
	        	}
	        	
	        } 
	        
	        System.out.println("total number of transaction  credited: " + totalCreditCount);
	        System.out.println("total number of transaction  debited: " + totalDebitCount);
	        System.out.println("Ammount  credited: " + totalCreditAmount);
	        System.out.println("Amount   debited : " + totalDebitAmount);
	        System.out.println("acoount balance is :" + (totalCreditAmount-totalDebitAmount));
	        System.out.println("acc balance : " + accountBalance);
	        
	        
	}

}
