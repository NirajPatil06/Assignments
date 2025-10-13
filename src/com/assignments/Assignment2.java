package com.assignments;

public class Assignment2 {

	public static void main(String[] args) {

		
		/*Create a 3D array to represent the following data:
			o Semesters as the first dimension.
			o Subjects and Marks as the second dimension.
			o Actual values for Subject Names and Marks as the third dimension. */
		
		// Approach 1
		
		 String [][][] result = 
		{  // This is the main array 
				
				{ // Semester 1  Array index 0  
				{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},

	// Subject index     0                1          3                 3                       4                     5
	
	// Marks Index	   0     1     2     3     4     5		
                    {"78", "85", "91", "74", "88", "79"}
					
				},
				
				{ // Semester 2  Array index 1
					 
	// Subject index      0                 1               2                 3                       4                       5
					{"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
                   
	// Marks Index	   0     1     2     3     4     5			
					{"82", "77", "93", "69", "84", "90"}
						
				},
				 
				{ // Semester 3  Array index 2
					 
	// Subject index	   0                    1                      2                      3                      4                     5
					{"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
                   
    // Marks Index	   0     1     2     3     4     5
					{"88", "81", "76", "92", "85", "78"}
					
				},
				
				{ // Semester 4  Array index 3
					
	// Subject index      0                 1                  2                   3                       4                     5
					   
					{"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
                   
  // Marks Index	   0     1     2     3     4     5
					{"91", "73", "89", "80", "76", "87"}
					
				},
				
				{ // Semester 5  Array index 4
					
	// Subject index            0                    1                   2                 3                       4                     5
					 {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
                     
	// Marks Index	   0     1     2     3     4     5		 
					 {"86", "88", "84", "95", "73", "90"}	
				}
				 
		 };
		 
		 
		// Print Semester 3 Subject 4 and Subject 5 names
		 
		 System.out.println("Semester 3, Subject 4: " + result[2][0][3]);// Operating System
		 System.out.println("Semester 3, Subject 5: " + result[2][0][4]); // Signals and Systems

	    // Print marks of Semester 6, Subject 3 and Subject 6
	     System.out.println("Semester 5, Subject 3 Marks: " + result[4][1][2]); // Compiler Design - 84
	     System.out.println("Semester 5, Subject 6 Marks: " + result[4][0][5]); // Computer Graphics - 90
	
	 
	     // Approach 2
	     
	     String [][][] data = new String [5][6][6];
	     
          data [0][0][0] = "Mathematics I" ;
          data [3][1][2] = "89";
          
          System.out.println("Semester 1 subject name is: " + data [0][0][0] );
          System.out.println("Semester 4 3rd subject marks is: " + data [3][1][2]);
          
	     
	     
	}

}
