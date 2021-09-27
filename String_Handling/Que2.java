
public class Que2 {

	public static void main(String[] args) {
		
		String s = "Sachin Ramesh Tendulkar";
		
		String a[] = s.split(" ");
		//Sachin          0
		//Ramesh          1
		//Tendulkar       2
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
			
		}
		
	}

}
