package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {

		System.out.println("*************ArrayList****************");
		List <String> studentNameArrayList = new ArrayList <String>();
		studentNameArrayList.add("Niraj");
		studentNameArrayList.add("Sagar");
		studentNameArrayList.add("Janvi");
		studentNameArrayList.add("Yatin");
		studentNameArrayList.add("Durgesh");
		studentNameArrayList.add("Niraj");
		studentNameArrayList.add("Sachi");
		studentNameArrayList.add(null);
		System.out.println(studentNameArrayList);
		System.out.println("ArrayList Size:" + studentNameArrayList.size());
		
		System.out.println("*************LinkedList****************");
		List <String> studentNameLinkedList = new LinkedList <String>();
		studentNameLinkedList.add("Niraj");
		studentNameLinkedList.add("Sagar");
		studentNameLinkedList.add("Janvi");
		studentNameLinkedList.add("Yatin");
		studentNameLinkedList.add("Durgesh");
		studentNameLinkedList.add("Niraj");
		studentNameLinkedList.add("Sachi");
		studentNameLinkedList.add(null);
		System.out.println(studentNameLinkedList);
		System.out.println("LinkedList Size:" + studentNameLinkedList.size());
		
		System.out.println("*************HashSet****************");
		Set <String> studentNameHashSet = new HashSet <String>();
		studentNameHashSet.add("Niraj");
		studentNameHashSet.add("Sagar");
		studentNameHashSet.add("Janvi");
		studentNameHashSet.add("Yatin");
		studentNameHashSet.add("Durgesh");
		studentNameHashSet.add("Niraj");
		studentNameHashSet.add("Sachi");
		studentNameHashSet.add(null);
		System.out.println(studentNameHashSet);
		System.out.println("HashSet Size:" + studentNameHashSet.size());
		
		System.out.println("*************LinkedHashSet****************");
		Set <String> studentNameLinkedHashSet = new LinkedHashSet <String>();
		studentNameLinkedHashSet.add("Niraj");
		studentNameLinkedHashSet.add("Sagar");
		studentNameLinkedHashSet.add("Janvi");
		studentNameLinkedHashSet.add("Yatin");
		studentNameLinkedHashSet.add("Durgesh");
		studentNameLinkedHashSet.add("Niraj");
		studentNameLinkedHashSet.add("Sachi");
		studentNameLinkedHashSet.add(null);
		System.out.println(studentNameLinkedHashSet);
		System.out.println("LinkedHashSet Size:" + studentNameLinkedHashSet.size());
		
		System.out.println("*************TreeSet****************");
		Set <String> studentNameTreeSet = new TreeSet <String>();
		studentNameTreeSet.add("Niraj");
		studentNameTreeSet.add("Sagar");
		studentNameTreeSet.add("Janvi");
		studentNameTreeSet.add("Yatin");
		studentNameTreeSet.add("Durgesh");
		studentNameTreeSet.add("Niraj");
		studentNameTreeSet.add("Sachi");
		//studentNameTreeSet.add(null);
		System.out.println(studentNameTreeSet);
		System.out.println("TreeSet Size:" + studentNameTreeSet.size());
		
		System.out.println("*************HashMap****************");
		Map <String,Integer> studentNameHashMap = new HashMap <String,Integer>();
		studentNameHashMap.put("Niraj",1);
		studentNameHashMap.put("Sagar",2);
		studentNameHashMap.put("Janvi",3);
		studentNameHashMap.put("Yatin",4);
		studentNameHashMap.put("Durgesh",5);
		studentNameHashMap.put("Niraj",6);
		studentNameHashMap.put("Sachi",7);
		studentNameHashMap.put(null,8);
		studentNameHashMap.put("jon",null);
		System.out.println(studentNameHashMap);
		System.out.println("HashMap Size:" + studentNameHashMap.size());
		
		System.out.println("*************LinkedHashMap****************");
		Map <String,Integer> studentNameLinkedHashMap = new LinkedHashMap <String,Integer>();
		studentNameLinkedHashMap.put("Niraj",1);
		studentNameLinkedHashMap.put("Sagar",2);
		studentNameLinkedHashMap.put("Janvi",3);
		studentNameLinkedHashMap.put("Yatin",4);
		studentNameLinkedHashMap.put("Durgesh",5);
		studentNameLinkedHashMap.put("Niraj",6);
		studentNameLinkedHashMap.put("Sachi",7);
		studentNameLinkedHashMap.put(null,8);
		studentNameLinkedHashMap.put("jon",null);
		System.out.println(studentNameLinkedHashMap);
		System.out.println("LinkedHashMap Size:" + studentNameLinkedHashMap.size());
		
		System.out.println("*************TreeMap****************");
		Map <String,Integer> studentNameTreeMap = new TreeMap <String,Integer>();
		studentNameTreeMap.put("Niraj",1);
		studentNameTreeMap.put("Sagar",2);
		studentNameTreeMap.put("Janvi",3);
		studentNameTreeMap.put("Yatin",4);
		studentNameTreeMap.put("Durgesh",5);
		studentNameTreeMap.put("Niraj",6);
		studentNameTreeMap.put("Sachi",7);
		//studentNameTreeMap.put(null,8);
		studentNameTreeMap.put("jon",null);
		System.out.println(studentNameTreeMap);
		System.out.println("TreeMap Size:" + studentNameTreeMap.size());
		
		System.out.println("*************Hashtable****************");
		Map <String,Integer> studentNameHashtable = new Hashtable <String,Integer>();
		studentNameHashtable.put("Niraj",1);
		studentNameHashtable.put("Sagar",2);
		studentNameHashtable.put("Janvi",3);
		studentNameHashtable.put("Yatin",4);
		studentNameHashtable.put("Durgesh",5);
		studentNameHashtable.put("Niraj",6);
		studentNameHashtable.put("Sachi",7);
		//studentNameHashtable.put(null,8);
		//studentNameHashtable.put("jon",null);
		System.out.println(studentNameHashtable);
		System.out.println("Hashtable Size:" + studentNameHashtable.size());
		
		
		
	}

}
