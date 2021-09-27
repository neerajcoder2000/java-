package day2;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(50);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------------");
		//  Collections.shuffle(list);
	   //	Collections.reverse(list);
		
		 for(Integer i:list) {
			 System.out.println(i);
		 }
		 
		 System.out.println("-------------Maximum Number-----------");
		 int element=Collections.max(list);
		 System.out.println("Maximum number: "+element);
		 
		 System.out.println("-------------Minimum Number-----------");
		 int element1=Collections.min(list);
		 System.out.println("Maximum number: "+element1);
		 
		 System.out.println("-------------After Swappig-------------");
		 Collections.swap(list, 1, 3);
		 
		  for(Integer i:list) {
			  System.out.println(i);
		  }
		  
		  System.out.println("--------------get--------------");
		  int a=list.get(2);
		  System.out.println("a:"+a);
		  
		  System.out.println("---------------------set--------------");
		  list.set(2,80);
		  
		  for(Integer i:list) {
			  System.out.println(i); 
		  }
		  
		  
		

	}

}
