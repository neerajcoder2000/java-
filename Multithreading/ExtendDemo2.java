class MyThread1 extends Thread{
	
	public void run() {
	int i=0;
	while(i<4000) {
		
		System.out.println("My thread1 is Running");
		System.out.println("I am Happy!");
		i++;
	   }  
	
	}
	
}

class MyThread3 extends Thread{
	
	public void run() {
	int i=0;
	while(i<4000) {
		
		System.out.println("My thread3 is good");
		System.out.println("I am sad!");
		i++;
	   }  
	
	}
	
}

public class ExtendDemo2 {

	public static void main(String[] args) {
		
		MyThread1 t1 =  new MyThread1();
		MyThread3 t2 =  new MyThread3();
		t1.start();
		t2.start();
		
		

	}

}
