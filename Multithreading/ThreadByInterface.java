class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread is running "+Thread.currentThread().getName());
	}
	
}
public class ThreadByInterface {

	public static void main(String[] args) {
		
		MyThread2 t=new MyThread2();
		Thread t1=new Thread(t);
		t1.start();

	}

}
