package Question3;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNameThread pnt1 = new PrintNameThread("Kim");
		Thread t1 = new Thread(pnt1);
		t1.start();
		
		PrintNameThread pnt2 = new PrintNameThread("John");
		Thread t2 = new Thread(pnt2);
		t2.start();
		
		PrintNameThread pnt3 = new PrintNameThread("Park");
		Thread t3 = new Thread(pnt3);
		t3.start();
	}

	

}
