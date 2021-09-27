package Day1;

class Student{
	int sid;
	String sname;
	static String college="Squad";
	
	public void show() {
		System.out.println("sid: "+sid);
		System.out.println("sname: "+sname);
		System.out.println("college: "+college);
		
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.sid=101;
		s.sname="Neeraj";
		s.show();
		
		Student.college="coder";
		
		Student s1 = new Student();
		s1.sid=102;
		s1.sname="Amit";
		
		s1.show();
		
	}

}
