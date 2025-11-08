package com.assignments;

public class Pyramid {

	public static void main(String[] args) {

		  int n = 5;
		   //upper pyramid
		   for(int i=1;i<=n;i++){
		       
		       //for spaces
		       for(int j=n;j>i;j--){
		           System.out.print(" ");
		           
		       }
		       
		       // add number with space
		      for(int j=1;j<=i;j++){
		          System.out.print(j+ " ");
		      }
		       System.out.println();
	}
	   for(int i=n-1;i>=1;i++){
		       
		       //for spaces
		       for(int j=n;j>i;j--){
		           System.out.print(" ");
		           
		       }
		       
		       // add number with space
		      for(int j=1;j<=i;j++){
		          System.out.print(j+ " ");
		      }
		       System.out.println();
	}

}
}