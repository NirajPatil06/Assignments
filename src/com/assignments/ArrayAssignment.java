package com.assignments;

public class ArrayAssignment {

	public static void main(String[] args) {

		/*Create a 3D array to represent the following data:
		o Semesters as the first dimension.
		o Subjects and Marks as the second dimension.
		o Actual values for Subject Names and Marks as the third dimension. */
	
		
		String [] [] [] result = 
			
			{
					
			{//sem 1 index 0
						
			//subject name array index :0 			
			{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
//subject index:    0			       1           3                4                        5                        6
			
			//Mark array index: 1    
			{"78", "85", "91", "74", "88", "79"}
//marks index: 0     1      2    3     4     5			
						
			},
					
		    {//sem 2 index: 1
						
			//subject name array index :0 			
			{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
//subject index:    0			       1           3                4                        5                        6
						
			//Mark array index: 1    
			{"78", "85", "91", "74", "88", "79"}
//marks index: 0     1      2    3     4     5		
			},
				
		    
			{//sem 3 index 2
						
	        //subject name array index :0 			
			{"Mathematics II", "Physics2", "Chemistry2", "Computer Programming I", "Engineering Drawing I", "Basic Electrical Eng.II"},
//subject index:    0			       1           3                4                        5                        6
						
			//Mark array index: 1    
			{"78", "85", "91", "74", "88", "79"}
//marks index: 0     1      2    3     4     5		
			},
			
		
			{//sem 4 index 3
			//subjects
			//subject name array index :0 			
			{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
//subject index:    0			       1           3                4                        5                        6
						
			//Mark array index: 1    
			{"78", "85", "91", "74", "88", "79"}
//marks index: 0     1      2    3     4     5		
			},
	
		
			};
		
		System.out.println(result[2][0][1]);
		
	}
}
