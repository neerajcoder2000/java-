package JDk8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		//for Integer
		Predicate<Integer> p1=s->{
			return s>5;
		};
		System.out.println(p1.test(5));
		System.out.println(p1.test(8));

		System.out.println("--------------");
		
		//for String 
		Predicate<String> p=s->{
			
			return s.equals("Hello");
		};
		System.out.println(p.test("Hello"));
		System.out.println(p.test("Hello world"));
		
		System.out.println("-------------");
		
		//and
		Predicate<String> p2=p.and(s->s.length()<8);
		System.out.println(p2.test("Hello"));
		
		System.out.println("--------------------");
		//or
		Predicate<String> p3=p.or(s->s.length()<8);
		System.out.println(p2.test("Hello World"));
		
		System.out.println("--------------------");
		//negate
		Predicate<String> p4=p.negate();
		System.out.println(p4.test("Hello World"));
	}

}
