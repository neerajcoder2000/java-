package day2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//It is following insertion order
		//it allow null value
		//It allows duplicates
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(null);
		list.add(40);
		list.add(null);
		
		
		System.out.println("--------------By using for each loop-----------------");
		for(Integer i:list) {
			System.out.println(i);
		}
		
       System.out.println("--------By using Iterator----------");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
        
	}

}
