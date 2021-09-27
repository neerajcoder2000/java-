package day3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>();
		
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(50);
		//set.add(null);
		set.add(50);
	//	set.add(null);
		
		for(Integer i:set) {
			System.out.println(i);
		}
		
		System.out.println("-------------By Using Iterator---------------");
		Iterator irt =set.iterator();
		
		while(irt.hasNext()) {
			System.out.println(irt.next());
		}
		
		System.out.println("--------------Collection Method-------------");
		
		//  Collections.shuffle(set);
		// Collections.reverse(set);
		
		System.out.println(Collections.max(set));
		
		System.out.println(Collections.min(set));
		
		//Collections.swap(null, 1, 4);
		
		// Collections.sort(set);
		
		System.out.println(set.isEmpty());
		System.out.println(set.contains(20));
		
		// System.out.println(set.indexOf(20));
		
		set.clear();
		System.out.println("Set is cleared now------");
		
		System.out.println(set.isEmpty());
		
		
		
		
		
	}

}
