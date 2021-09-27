package Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("John");
		e1.setSalary(50000);
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Johny");
		e2.setSalary(30000);
		
		Employee e3 = new Employee();
		e3.setEmpId(103);
		e3.setEmpName("Steve");
		e3.setSalary(20000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for(Employee e:list) {
			System.out.println(e);
		}
		
		System.out.println("---------------------------------");
		
		Employee emp1=new Employee(201, "Hina", 500000);
		Employee emp2=new Employee(202, "tina", 300000);
		Employee emp3=new Employee(203, "rina", 200000);
		
		Set<Employee> set=new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		Iterator<Employee> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		



	}

}
