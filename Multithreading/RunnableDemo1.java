class MultiDemo implements Runnable
{
	public void run()
	{
		try {
			System.out.println("Thread is runnimg "+Thread.currentThread().getId());
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}
public class RunnableDemo1 {

	public static void main(String[] args) {
	
		int n = 8;
		for(int i = 0; i<n; i++)
		{
			MultiDemo md = new MultiDemo();
			Thread t2 = new Thread(md);
			t2.start();
			
		}

	}

}
