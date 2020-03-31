package Question2;

public class SecondThread extends Thread{

	private int delay;
	private String name;
	private int counter;
	private int start;
	
	public SecondThread(String name,int delay,int counter)
	{
		this.name = name;
		this.delay = delay;
		this.counter = counter;
		start = 0;
	}
	
	public void run()
	{
		try
		{
			
			while(start < counter)
			{
			 Thread.sleep(delay);	
		     System.out.println(name);
		     start++;
			}
		}
		
		catch(InterruptedException ex)
		{
			System.out.println();
			ex.printStackTrace();
		}
	}
}

