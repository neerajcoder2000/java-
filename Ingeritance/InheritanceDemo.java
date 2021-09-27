package day1;

import java.util.Scanner;

class Person{
	int id;
	String fname;
	
	public void acceptDetails() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ID.....");
		id = scan.nextInt();
		System.out.println("Enter the First name");
		fname = scan.next();
		}
	public void displayDetails() {
		System.out.println("id: "+id);
		System.out.println("fname: "+fname);
			}
	
	}
class Employee extends Person{
	double salary;
	String post;
	
	public void acceptEmpDetails() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter salary");
		salary = scan.nextDouble();
		System.out.println("Enter the post");
		post = scan.next();
		}
	public void displayEmpDetails() {
		System.out.println("salary: "+salary);
		System.out.println("post: "+post);
			}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.acceptDetails();
		e.acceptEmpDetails();
		e.displayDetails();
		e.displayEmpDetails();

	}

}
