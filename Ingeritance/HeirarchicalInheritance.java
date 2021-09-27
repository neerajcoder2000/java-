package day2;

import java.util.Scanner;

class Person{
	
	String Name;
	
	Scanner scan = new Scanner(System.in);
	
	public void acceptDetails() {
		System.out.println("Enter Name");
		Name= scan.next();
		}
	
	public void displayDetails() {
		System.out.println("Name: "+Name);
	}
	
}

class Employee extends Person{
	
	int eid;
	
	public void acceptEmpDetails() {
		System.out.println("Enter Employee id");
		eid= scan.nextInt();
		
	}
	public void displayEmpDetails() {
		System.out.println("eid: "+eid);
		
		}
}
class Student extends Person {
	int sid;
	
	public void acceptStudentDetails() {
		System.out.println("Enter Student id");
		sid= scan.nextInt();
	}
	
	public void displayStudentDetails() {
		System.out.println("sid: "+sid);
		
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.acceptDetails();
		e.acceptEmpDetails();
		e.displayDetails();
		e.displayEmpDetails();
		
		Student s = new Student();
		s.acceptDetails();
		s.acceptStudentDetails();
		s.displayDetails();
		s.displayStudentDetails();
	
	
		
	}

}
