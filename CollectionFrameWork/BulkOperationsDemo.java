package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperationsDemo {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		List<String> list2 = new ArrayList<>(Arrays.asList("a","b","c"));
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println("----------------------");
		System.out.println(list1.contains(list2));
		System.out.println(list2.contains(list1));
		
		System.out.println("-----------------------");
	 //   list1.addAll(list2);
	    System.out.println(list1);
	    
	    System.out.println("-------------------------------");
	 //   list1.removeAll(list2);
	    System.out.println(list1);
	    
	    System.out.println("------------------------------");
	    list1.retainAll(list2);            // returns common value between two list
	    System.out.println(list1);
	}

}
