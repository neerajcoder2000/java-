package JDk8;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner(",");
		
		sj.setEmptyValue("Empty!!!");
		System.out.println(sj);
		
		sj.add("Red");
		sj.add("Green");
		sj.add("Blue");
		sj.add("Yellow");
		sj.add("Black");
		
		System.out.println(sj);
		
		sj.setEmptyValue("Empty!!!");
		System.out.println(sj);
		
		System.out.println("----------------------");
		System.out.println("Length: "+sj.length());
		
		System.out.println("-----------------------");
		
		StringJoiner sj1=new StringJoiner(":","[", "]");
		
		sj1.add("Apple");
		sj1.add("Orange");
		sj1.add("Mango");
		sj1.add("Banana");
		
		System.out.println(sj1);
		
		
	}

}
