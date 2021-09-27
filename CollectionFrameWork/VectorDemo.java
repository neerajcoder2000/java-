package day3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//It follow insertion order
		//It allows null value
		//It allows duplicate value
		
		Vector<Integer> vec=new Vector<>();
		vec.addElement(10);
		vec.addElement(50);
		vec.addElement(30);
		vec.addElement(40);
		vec.addElement(20);
		vec.addElement(null);
		vec.addElement(null);
		
		System.out.println("---------By for each loop-------------");
		for(Integer i:vec) {
			System.out.println(i);
		}
		
		System.out.println("---------Using Iterator-----------");
		Iterator itr=vec.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------Using enumeration-------------");
		
		Enumeration<Integer> en=vec.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
	}

}
