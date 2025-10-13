package com.assignments;
//Child can extends parents class
public class EmpGroups extends Employees {
	
	

	public static void main(String[] args) {
		//Created Empty array for storing employee names and id 
		String[] empName = new String [3];
		int [] empId = new int [3];
		
        // Created Object / new copy of Employee class
		Employees object = new Employees();
		
		//Storing  parent class values to empty array 
		empName = object.EmpNames;
		empId= object.Ids;
		
		//Printing data index wise
		System.out.println("Employee Name is:"+empName[0]+ " , " + "Employee ID:"+empId[0]);
		System.out.println("Employee Name is:"+empName[1]+ " , " + "Employee ID:"+empId[1]);
		System.out.println("Employee Name is:"+empName[2]+ " , " + "Employee ID:"+empId[2]);
		
		

		
		
	}

}
