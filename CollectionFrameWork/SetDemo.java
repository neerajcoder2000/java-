package day3;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		
		hs.add("B");
		hs.add("A");
		hs.add("C");
		hs.add("A");
		
		System.out.println(hs);
		
        String check = "D";
        
        System.out.println("Contains "+ check + " "+ hs.contains(check));
        
        System.out.println("------------Removing The element---------------");
        
        hs.remove("B");
        System.out.println("remove: "+ hs);
	}

}
