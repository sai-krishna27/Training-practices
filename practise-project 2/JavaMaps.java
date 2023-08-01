package com.java;

import java.util.*;

public class JavaMaps {

	public static void main(String[] args) {
		
		//implementing Map
		Map<String,Integer> map=new HashMap<>();
		map.put("a", 97);
		map.put("b", 98);
		map.put("c", 99);
		System.out.print("HashMap : ");
		for(Map.Entry m:map.entrySet()){    
			System.out.print(" "+m.getKey()+"->"+m.getValue());    
		}
		
		
		//implementing treeMap
		Map<String,Integer> tm=new TreeMap<>();
		tm.put("a", 97);
		tm.put("b", 98);
		tm.put("c", 99);
		System.out.print("\nTreeMap : ");
		for(Map.Entry m:tm.entrySet()){    
			System.out.print(" "+m.getKey()+"->"+m.getValue());    
		}
		
		//implementing Hash table
		Hashtable<String,Integer> ht=new Hashtable<>();
		ht.put("a", 97);
		ht.put("b", 98);
		ht.put("c", 99);
		System.out.print("\nHashtable : ");
		for(Map.Entry m:ht.entrySet()){    
			System.out.print(" "+m.getKey()+"->"+m.getValue());    
		}
		
	}

}
