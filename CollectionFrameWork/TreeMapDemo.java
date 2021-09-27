package day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		// it is not following insertion order 
		// It allows duplicates values
		// It doesnot allow s null place for multiple value
		
		
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(12, "Welcome");
		map.put(78, "Hello");
		map.put(54, "Hi");
		map.put(32, "Bye");
		map.put(25, null);
	//	map.put(null, "GoodBye!!!");
	//	map.put(null, "Hiiiii");
	 	map.put(65,null);
		map.put(25, "Bye!!!");
		
		System.out.println(map);
		
System.out.println("------------------------------------");
		
		//Way1
		Set<Integer> key=map.keySet();
		System.out.println(key);
		
		System.out.println("------------------------------");
		
		for(Integer i:key) {
			System.out.println(i+" : "+ map.get(i));
		}
		
		System.out.println("---------------------------------");
		//Way2
		
		Iterator<Entry<Integer, String>> itr=map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

		System.out.println("-------------------------------------------");
		//Way3
		
		for(Entry obj:map.entrySet()) {
		//	System.out.println(obj);
			
			System.out.println(obj.getKey()+" : "+obj.getValue());
		}
		
		
		
		System.out.println("-------------------------------------");
		
		//Way4
		
		for(Map.Entry obj:map.entrySet()) {
			System.out.println(obj);
		}
		

	}

}
