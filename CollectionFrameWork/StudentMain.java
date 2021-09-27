package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student(102,"Johan", 85);
		Student s2=new Student(105,"Johny", 65);
		Student s3=new Student(101,"Jiya", 75);
		
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println("------------Sorting Based on id-----------");
		
		Collections.sort(list, new IdCompare());
		 for(Student s:list) {
			 System.out.println(s);
			 
		 }
		 
		 System.out.println("-----------------Sorting basedon name-----------");
		 
		 Collections.sort(list, new NameCompare());
		 
		 for(Student s:list) {
			 System.out.println(s);
		 }
		 
		 System.out.println("---------------------Sorting based on number------------");
		 
		  Collections.sort(list, new MarkCompare());
		  for(Student s:list) {
				 System.out.println(s);
			 }
		  

	}

}
