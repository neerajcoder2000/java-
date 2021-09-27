class ChildThread1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("thread is running "+Thread.currentThread().getName());
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) {
		ChildThread1 c1 = new ChildThread1();
		Thread t1 = new Thread(c1);
		t1.start();

	}

}
