package day2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Neeraj");
		list.add("Neha");
		list.add("Nidhi");
		list.add("sonal");
		list.add("khushi");

		System.out.println("-----------Before Soring--------------");
		for(String s:list) {
			System.out.println(s);
		}
       System.out.println("---------------After Sorting -----------------");
       Collections.sort(list);
       for(String s:list) {
    	   System.out.println(s);
       }
         
       System.out.println("-----------------");
       
       System.out.println(list.isEmpty());
       System.out.println(list.contains("Neha"));
       System.out.println(list.contains("johan"));
       System.out.println(list.contains("Nidhi"));
       
       list.clear();
       System.out.println("List is cleared now--------");
       System.out.println(list.isEmpty());
       
		

	}

}
