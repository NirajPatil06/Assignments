package com.assignments;

public class ConditionalStatements {

	public static void main(String[] args) {


		int a = 17;
		
		if(a>=18 && a<=59) {
			
			System.out.println("eligible for vote");
		}
		else if(a>= 60) {
			
			System.out.println("senior citizen");
		}
		else {
			
			System.out.println("Not eligible for vote");
		}
	}
	

}
