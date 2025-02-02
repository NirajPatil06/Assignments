package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		
        //Created HashMap Emp 1
		Map<String,String> emp1Data = new HashMap<String,String> ();
		emp1Data.put("EmployeeID", "E001");
		emp1Data.put("Name", "Alice Green");
		emp1Data.put("Age", "30");
		emp1Data.put("Gender", "Female");
		emp1Data.put("Department", "Engineering");
		emp1Data.put("Position", "Software Engineer");
		emp1Data.put("Salary", "75000");
		emp1Data.put("Email", "alice@example.com");
		emp1Data.put("Contact Numer", "9878677876");
		
		//Created HashMap Emp 2
		Map<String,String> emp2Data = new HashMap<String,String> ();
		emp2Data.put("EmployeeID", "E002");
		emp2Data.put("Name", "Bob Johnson");
		emp2Data.put("Age", "35");
		emp2Data.put("Gender", "Male");
		emp2Data.put("Department", "Marketing");
		emp2Data.put("Position", "Marketing Engineer");
		emp2Data.put("Salary", "85000");
		emp2Data.put("Email", "bob@example.com");
		emp2Data.put("Contact Numer", "9403343445");
		
		//Created HashMap Emp 3
		Map<String,String> emp3Data = new HashMap<String,String> ();
		emp3Data.put("EmployeeID", "E003");
		emp3Data.put("Name", "Corel White");
		emp3Data.put("Age", "35");
		emp3Data.put("Gender", "Female");
		emp3Data.put("Department", "Sales");
		emp3Data.put("Position", "Sales Executive");
		emp3Data.put("Salary", "65000");
		emp3Data.put("Email", "corol@example.com");
		emp3Data.put("Contact Numer", "9878679890");
		
		//Store HashMap into List 
		List<Map<String,String>> empData = new ArrayList<Map<String,String>> ();
		
		//Store Values in empData List variable from emp1Data, 2 and 3 Map
		empData.add(emp1Data);
		empData.add(emp2Data);
		empData.add(emp3Data);
		
		//Printing the for bob email
		System.out.println("Bob's Email: " + empData.get(1).get("Email"));
		
	}

}
