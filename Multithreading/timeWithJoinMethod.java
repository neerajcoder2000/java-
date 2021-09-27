class MyThr5 extends Thread{
	
	MyThr5(String str){
		super(str);{
			
		}
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		
		
	}
}
public class timeWithJoinMethod {

	public static void main(String[] args) {
		
		
		MyThr5 m1 = new MyThr5("first thread");
		MyThr5 m2 = new MyThr5("second thread");
		
		m1.start();
		
		try{
			m1.join(1500);
		}
		catch(InterruptedException ie) {

		System.out.println(ie);
		}
        m2.start();
        
        try {
        	m2.join(1500);
        	}
        catch(InterruptedException ie) {
        	System.out.println(ie);
        }
     }
}
