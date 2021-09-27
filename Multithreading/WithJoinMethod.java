class MyThr4 extends Thread{
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
public class WithJoinMethod {

	public static void main(String[] args) {
		
		MyThr4 m1 = new MyThr4();
		MyThr4 m2 = new MyThr4();
		
		m1.start();
		try {
			m1.join();
		}
		catch(InterruptedException ie) {}
		m2.start();
	
	}

}
