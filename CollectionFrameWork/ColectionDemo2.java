package day2;

import java.util.ArrayList;
import java.util.List;

public class ColectionDemo2 {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(15);
		list.add('a');
		list.add("Neeraj");
		list.add(20.5);
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("---------After adding more element-----------");
		list.add(30);
		list.add(30.5);
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("-------------After adding element according to index no------------");
		
		list.add(2, 80);
		
		for(Object obj:list) {
			System.out.println(obj);
		}

		System.out.println("------------After Removing element--------------");
		list.remove(2);
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("------------Size------------------");
		System.out.println(list.size());
	}

}
