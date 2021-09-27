class MyThr1 extends Thread{
	public MyThr1(String name) {
		super(name);
		}
	
	public void run() {
		int i = 34;
		while(true) {
		System.out.println("thank you for java " + this.getName());
	}
	}
}
public class ThreadPriorities {

	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1("Amit1");
		MyThr1 t2 = new MyThr1("Ranoldo2");
		MyThr1 t3 = new MyThr1("Abhaiy3");
		MyThr1 t4 = new MyThr1("Crish4");
		MyThr1 t5 = new MyThr1("Jrmensh5");
		MyThr1 t6 = new MyThr1("wanner6(most Important)");
		t6.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
	}

}
