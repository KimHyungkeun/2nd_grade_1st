package Question3;

public class PrintNameThread extends Thread{

	private String name;
	private int counter;
	private int start;
	
	public PrintNameThread(String name)
	{
		this.name = name;
		this.counter = 5;
		start = 0;
	}
	
	public void run()
	{
		while(start < counter)
		{
			System.out.println(name);
			start++;
		}
	}
}
