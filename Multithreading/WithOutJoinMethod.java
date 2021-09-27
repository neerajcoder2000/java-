class MyThr3 extends Thread{
	public void run() {
		System.out.println("r1");

	try {
		Thread.sleep(500);
	}
	catch(InterruptedException ie) {
		
	}
		System.out.println("r2");
   
  }
}
public class WithOutJoinMethod {

	public static void main(String[] args) {
		
		MyThr3 m1 = new MyThr3();
		MyThr3 m2 = new MyThr3();
		
		m1.start();
		m2.start();
		

	}

}
