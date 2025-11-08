package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Assignment7 {

	public static void main(String[] args) {

		/*Bank Transactions
		Positive value refers Credit and Negative refers Debit Transaction
		Transactions Amount
		1 50000
		2 -2000
		3 3000
		4 -15000
		5 -200
		6 -300
		7 4000
		8 -3000
		First Store all the transactions in any data structure of Your Choice from collections, and by using
		Loops and conditional statements
		1. Print total number of credit and debit transactions completed
		2. Print the total amount credited and debited in account
		3. Print total amount remaining at the end in Bank Account
		4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
		Transaction with Amount” and also print total number of suspicious transactions */
		
		HashMap <Integer, Integer> bankTransactions = new HashMap <Integer, Integer> ();
		bankTransactions.put(1,50000);
		bankTransactions.put(2,-2000);
		bankTransactions.put(3,3000);
		bankTransactions.put(4,-15000);
		bankTransactions.put(5,-200);
		bankTransactions.put(6,-300);
		bankTransactions.put(7,4000);
		bankTransactions.put(8,-3000);
		System.out.println("entry set"+bankTransactions.entrySet());
		
		ArrayList <HashMap <Integer, Integer> > transData = new ArrayList <HashMap <Integer, Integer> >();
		transData.add(bankTransactions);
		
		 // Variables for calculations
        int creditCount = 0;
        int debitCount = 0;
        int creditTotal = 0;
        int debitTotal = 0;
        int suspiciousCount = 0;
        

        // Loop through the list (only 1 map here)
        for (HashMap<Integer, Integer> data : transData) {
            // Iterate over transaction entries
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                int transactionId = entry.getKey();
                int amount = entry.getValue();
                

                if (amount > 0) {
                    // Credit
                    creditCount++;
                    creditTotal += amount;
                    if (amount > 10000) {
                        System.out.println("Suspicious credit transaction with amount: " + amount + " (Transaction ID: " + transactionId + ")");
                        suspiciousCount++;
                    }
                } else if (amount < 0) {
                    // Debit
                    debitCount++;
                    debitTotal += Math.abs(amount);
                    if (Math.abs(amount) > 10000) {
                        System.out.println("Suspicious debit transaction with amount: " + Math.abs(amount) + " (Transaction ID: " + transactionId + ")");
                        suspiciousCount++;
                    }
                }
            }
        }

        // Calculate remaining balance
        int balance = creditTotal - debitTotal;

        // Final Output
        System.out.println("\n--- Transaction Summary ---");
        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + creditTotal);
        System.out.println("Total amount debited: " + debitTotal);
        System.out.println("Remaining balance in bank account: " + balance);
        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
        
        
        
       
    }
}




