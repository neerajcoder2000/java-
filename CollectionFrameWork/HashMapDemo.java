package day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// It is not following insertion order not giving sorted data, it gives unordered data
		// It allows null value for key but only at once
		// It allows null at value place for multiple time
		// It allows Duplicates at place of value
		// It does not allows duplicates at place of key
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(12, "Welcome");
		map.put(78, "Hello");
		map.put(54, "Hi");
		map.put(32, "Bye");
		map.put(25, null);
		map.put(null, "GoodBye!!!");
		map.put(null, "Hiiiii");
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
