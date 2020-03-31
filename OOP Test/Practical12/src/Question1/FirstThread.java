package Question1;

public class FirstThread extends Thread{

	private String thisstring;
	
	public FirstThread(String string)
	{
		thisstring = string;
	}
	
	public void run()
	{
		System.out.println(thisstring);
	}
}
