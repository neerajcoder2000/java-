package Day1;

class Employee{
	int eid;
	String ename;
	static String office="squad";
	double salary;
	
	
	public static void show() {
	//	System.out.println("eid: "+eid);
	//	System.out.println("ename: "+ename);
		System.out.println("office: "+office);
	//	System.out.println("salary: "+salary);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		
      Employee e1 = new Employee();
      e1.eid = 1;
      e1.ename= "Neeraj";
      e1.salary= 50000;
      Employee.show();
      
      Employee e2 = new Employee();
      e2.eid = 2;
      e2.ename= "Raj";
      e2.salary= 70000;
      Employee.show();
	}

}
