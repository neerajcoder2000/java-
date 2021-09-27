
public class Que3 {

	public static void main(String[] args) {
		
		String s = "Sachin Ramesh Tendulkar";
		
		String a[] = s.split(" ");
		int len = a.length;
		for(int i=0;i<len-1;i++) {
			
			System.out.print(a[i].charAt(0)+".");
			
		}
		System.out.println(a[len-1]);
	}

}
