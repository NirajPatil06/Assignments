package com.assignments;

public class Operators {

	public static void main(String[] args) {


		//Arithmetic operator
		
		int a = 10;
		int b = 20;
		
		System.out.println(b%a);
		System.out.println(b/a);
		
		//Ternary operator
		
		int i =17;
		int j= 25;
		//int max = (i>j) ? i:j;
		
		String eligibilityForVote = (i>j) ? "eligible for vote" : "not eligible for vote";
		
		System.out.println(eligibilityForVote);
		
	}

}
