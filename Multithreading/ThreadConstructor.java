class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	public void run() {
		int i=34;
		System.out.println("Thank you");
	//	while(true) {
	//	 System.out.println("I am a Thread");
		}
}
public class ThreadConstructor {

	public static void main(String[] args) {
		
		MyThr t = new MyThr("Neeraj");
		MyThr t1 = new MyThr("Rajjj");
		t.start();
		t1.start();
		System.out.println("The Id of the thread t is " +t.getId());
		System.out.println("The Id of the thread t is " +t1.getId());
		System.out.println("the name of the thread t is " +t.getName());
		System.out.println("the name of the thread t is " +t1.getName());
		

	}

}
