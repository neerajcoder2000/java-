@FunctionalInterface
interface Runnable{
	void run();
	
}
public class FunctionalInterfaceDemo implements Runnable {

	public static void main(String[] args) {
		 
		FunctionalInterfaceDemo f = new FunctionalInterfaceDemo();
		f.run();

	}

	@Override
	public void run() {
		System.out.println("This is run method.....");
		
	}

}
