package Day5;

public class Employee1 implements Comparable<Employee1> {
	
	private int empId;
	private String empName;
	private double salary;
	
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee1(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Employee1 o) {
		
	//	return getEmpId()-o.getEmpId();
		
		return getEmpName().compareTo(o.getEmpName());
		
	
	}


	
	
	
	
	
	
	
	
	
	
	

}
