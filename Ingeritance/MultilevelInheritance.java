package day2;

import java.util.Scanner;

class Vehicle{
	
	String vehicleName;
	
	Scanner scan = new Scanner(System.in);
	public void acceptDetails() {
		System.out.println("Enter Vehicle Name");
		vehicleName = scan.next();
		
		}
	public void displayDetails() {
		System.out.println("vehicleName: "+vehicleName);
	}
	
}

class car extends Vehicle{
	String carName;
	int modelno;
	String color;
	
	public void acceptCarDetails() {
		System.out.println("Enter car Name");
		carName=scan.next();
		System.out.println("Enter modelno..");
		modelno=scan.nextInt();
		System.out.println("Enter color..");
		color=scan.next();
		}
	
	public void displayCarDetails() {
		System.out.println("car Name: "+carName);
		System.out.println("model no: "+modelno);
		System.out.println("color: "+color);
		}
	}
class BMW extends car{
	
	double price;
	
	public void acceptBMWDetails() {
		System.out.println("Enter price");
		price=scan.nextDouble();
		}
	
	public void displayBMWdetails() {
		System.out.println("price: "+price);
		
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.acceptDetails();
		b.acceptCarDetails();
		b.acceptBMWDetails();
		b.displayDetails();
		b.displayCarDetails();
		b.displayBMWdetails();
		
		
	}

}
