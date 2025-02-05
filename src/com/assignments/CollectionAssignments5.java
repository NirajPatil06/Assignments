package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionAssignments5 {

	public static void main(String[] args) {

		//1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		List <String> countrtNames = new ArrayList<String> ();
		countrtNames.add("India");
		countrtNames.add("USA");
		countrtNames.add("China");
		countrtNames.add("UK");
		countrtNames.add("Finland");
		
		System.out.println("Second Country Name is:"+ countrtNames.get(1));
		
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		Set <String> topTenToristPlaces = new HashSet <String> ();
		topTenToristPlaces.add("Raigad");
		topTenToristPlaces.add("Ellora Caves");
		topTenToristPlaces.add("Taj Mahal");
		topTenToristPlaces.add("Eiffel Tower");
		topTenToristPlaces.add("The Colosseum");
		topTenToristPlaces.add("Statue of Liberty");
		topTenToristPlaces.add("Gate Way of India");
		topTenToristPlaces.add("Taj Hotel");
		topTenToristPlaces.add("GOA");
		topTenToristPlaces.add("Shanivar Vada");
		
		System.out.println("Top ten tourist Attraction Names:"+topTenToristPlaces.size());
		
		//3. Create a map of the 5 largest cities in the United States and their populations.
		
		Map <String,Integer> usaLargestCityName = new HashMap <String,Integer> ();
		usaLargestCityName.put("New York City", 8097282);
		usaLargestCityName.put("Los Angeles", 3097282);
		usaLargestCityName.put("Chicago", 4097282);
		usaLargestCityName.put("Houston", 5097282);
		usaLargestCityName.put("Phoenix", 6097282);
		
	System.out.println("Top 5 cities Name is:" +usaLargestCityName );
	
	//4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
	
	   int [] num = {10,20,30,40,50,60,70,80,90,100};
	   
	   int sum = num[2]+num[4];
	   
	   System.out.println("Sum of 3rd and 5th Value is:" + sum);
	   
	  // 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
	   
	    List <String> movieNames = new LinkedList <String> ();
	    movieNames.add("Pushpa2");
	    movieNames.add("KGF");
	    movieNames.add("URI");
	    movieNames.add("3diots");
	    movieNames.add("DDLG");
	    
	    System.out.println("Third Movie Name Is:" + movieNames.get(2));
	}

}
