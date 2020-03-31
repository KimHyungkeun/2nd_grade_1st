package Question2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondThread t1 = new SecondThread("Hello World",500,10);
		t1.start();
		
		
		SecondThread t2 = new SecondThread("Hello World",500,10);
		t2.start();
		
		
		SecondThread t3 = new SecondThread("Hello World",500,10);
		t3.start();
	
		
		SecondThread t4 = new SecondThread("Hello World",500,10);
		t4.start();
		
		
		SecondThread t5 = new SecondThread("Hello World",500,10);
		t5.start();
	
	}

}
