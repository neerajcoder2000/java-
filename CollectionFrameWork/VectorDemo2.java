package day3;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<>(3);
		
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());
		
		System.out.println("-----------After Adding Elements---------------");
		vec.addElement("Mango");
		vec.addElement("Apple");
		vec.addElement("Orange");
		
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity()); //2X
		
		System.out.println("-------------After Adding more element------------");
		vec.addElement("Lichi");
		vec.addElement("Papaya");
		
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());
		
		System.out.println("-------------After Adding more element------------------");
		vec.addElement("Pineapple");
		vec.addElement("Grapes");
		
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());
		
		
		
		
	}

}
