package Day1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		// Collection c=new Collection();
		
		List c = new ArrayList();
		
	//	List list=new List();
		
		c.add(15);
		c.add("Neeraj");
		c.add(50.5);
		c.add('a');
		
		// Way 1:---------Return toString
		System.out.println(c);
		
		// Way 2:---------By using for each loop
		System.out.println("---------By using for each loop---------");
		
		for(Object obj:c) {
			System.out.println(obj);
		}
		
		// Way 3:---------By using for each method
		System.out.println("----------By using for each method---------");
		
		c.forEach(System.out::println);
		
		
		// Way 4:---------By using iterator
		
		System.out.println("--------By using Iterator----------");
		
		Iterator itr=c.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Way 5:-------By using list Iterator
		
		System.out.println("----------By using List Iterator----------");
		
		ListIterator l=c.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		System.out.println("-----------By using reverese Direction----------");
		
		
		
	}

}
