package day3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		// It follows insertion order
		// it allow null value
		// it allow duplicate value
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(10);
		list.add(50);
		list.add(null);
		list.add(null);
		
		
		
		System.out.println("-------------Before Adding-----------");
		for(Integer i:list) {
			System.out.println(i);
		}
		
		System.out.println("------------After Adding-----------");
		list.addFirst(80);
		list.addLast(90);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		System.out.println("----------After Removing-----------------");
		list.remove();
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		
		for(Integer i:list) {
			System.out.println(i);
			
		}
		
		 System.out.println("-------------Maximum Number-----------");
		 int element=Collections.max(list);
		 System.out.println("Maximum number: "+element);
		 
		 System.out.println("-------------Minimum Number-----------");
		 int element1=Collections.min(list);
		 System.out.println("Maximum number: "+element1);
		 
		 
		 System.out.println("--------------get--------------");
		  int a=list.get(2);
		  System.out.println("a:"+a);
		  
		  System.out.println("---------------------set--------------");
		  list.set(2,80);
		  
		  for(Integer i:list) {
			  System.out.println(i); 
		  }
		  /*
		  System.out.println("-------------After Swappig-------------");
		    Collections.swap(list, 1, 3);
			 
		     for(Integer i:list) {
				  System.out.println(i);
			  }
			  */
			  System.out.println("--------By using Iterator----------");
				
			   Iterator itr=list.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
		
	} 

}
