class ChildThread extends Thread{
	
	ChildThread()
	{
	super("demochild");	
	}
	public void run ()
	{
		System.out.println("Execution of child thread start from here.......");
		try {
			for(int i = 5; i>0; i--) {
			System.out.println(Thread.currentThread().getName()+" :"+ i);
			Thread.sleep(500);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("child interrupted .");
	
	}
		System.out.println("Exiting child thread.");
	}
}
public class ExtendThreadDemo {

	public static void main(String[] args) {
		ChildThread ct = new ChildThread();
		ct.start();
		

	}

}
