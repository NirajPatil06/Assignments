package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assingment4 {

	public static void main(String[] args) {

		
		        //Map for emp 1 details
		        Map <String, String> emp1 = new HashMap<String , String>();
		          emp1.put("empID","N01");
		          emp1.put("name","Niraj");
		          emp1.put("age","28");
		          emp1.put("gender","M");
		          emp1.put("department","IVS");
		          emp1.put("position","TA");
		          emp1.put("salary","85000");
		          emp1.put("email","n.patil@gmai.com");
		          emp1.put("contact no","1234567890");
		        
		        //Map for emp 2nd details
		        Map <String, String> emp2 = new HashMap<String , String>();
		          emp2.put("empID","j01");
		          emp2.put("name","jani");
		          emp2.put("age","28");
		          emp2.put("gender","M");
		          emp2.put("department","IVS");
		          emp2.put("position","TA");
		          emp2.put("salary","85000");
		          emp2.put("email","j.patil@gmai.com");
		          emp2.put("contact no","1234567890");
		          
		         //Map for emp 3rd details 
		        Map <String, String> emp3 = new HashMap<String , String>();
		          emp3.put("empID","Y01");
		          emp3.put("name","Yatin");
		          emp3.put("age","28");
		          emp3.put("gender","M");
		          emp3.put("department","IVS");
		          emp3.put("position","TA");
		          emp3.put("salary","85000");
		          emp3.put("email","y.patil@gmai.com");
		          emp3.put("contact no","1234567890");
		          
		         //store all Map in List
		         List <Map <String, String>> empdata = new ArrayList<>();
		        empdata.add(emp1);
		        empdata.add(emp2);
		        empdata.add(emp3);
		        
		        System.out.println(empdata.get(1).get("email"));
		        
		        //use inhanced for loop for printing email id
		        System.out.println("Emp email id");
		        for(Map <String ,String> data : empdata){
		            System.out.println(data.get("email"));
		        }
		        
		        //Printing all emp names:
		        System.out.println("emp names are:");
		        for(Map<String,String> name : empdata){
		            
		            System.out.println(name.get("name"));
		        }
		       
		        
		    }
		}
	


