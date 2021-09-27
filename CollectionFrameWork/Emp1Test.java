package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emp1Test {

	public static void main(String[] args) {
		
		Employee1 e1= new Employee1(105, "Riya", 5000000);
		Employee1 e2= new Employee1(106, "Piya", 8000000);
		Employee1 e3= new Employee1(107, "SuRiya", 3000000);
		
		List<Employee1> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list);
		
		for(Employee1 e:list) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
