package day6;

import java.util.Comparator;

public class Student {
	
	private int sId;
	private String sName;
	private double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, double marks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.marks = marks;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", marks=" + marks + "]";
	}
	
}

class IdCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getsId()-o2.getsId();
	}
	
}

class NameCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getsName().compareTo(o2.getsName());
	}
	
}
class MarkCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getMarks()-o2.getMarks()) ;
	}
}
