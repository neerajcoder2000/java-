package day2;

class Employee2 {
	int eid;
	String ename;
	
	Employee2(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
		
	}
	public void show() {
		System.out.println("eid :"+eid);
		System.out.println("ename :"+ename);
	}
}

class Programmer2 extends Employee2{
	
	double salary;

	Programmer2(int eid, String ename,double salary) {
		super(eid, ename);
		this.salary=salary;
		
	}
	
	public void show() {
		super.show();
		System.out.println("salary :"+salary);
	}

}

public class SuperDemo2 {

	public static void main(String[] args) {
		
		Programmer2 p= new Programmer2(1, "Niraj", 200000);
		p.show();
		
		
		

	}

}
