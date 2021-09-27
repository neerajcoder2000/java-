class MyThr2 extends Thread{
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
public class IsAliveMethod {

	public static void main(String[] args) {
		MyThr2 m1 = new MyThr2();
		MyThr2 m2 = new MyThr2();
		m1.start();
		m2.start();
		System.out.println(m1.isAlive());
		System.out.println(m2.isAlive());

	}

}
