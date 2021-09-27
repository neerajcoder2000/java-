class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread is running "+ Thread.currentThread());
	}
	
}
public class ThreadByClass {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread t=new MyThread();
		t.setName("MyThread");
		t.setPriority(5);
		t.start();
		//t.run();

	}

}
    