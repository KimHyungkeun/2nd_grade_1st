package Question6;

public class Coin implements Comparable{
	private int thisnum;
	
	public Coin(int num)
	{
		thisnum = num;
	}
	
	
	
	public int compareTo(Object other)
	{
		Coin str = (Coin) other;
		
		if(this.thisnum < str.result())
			return 1;
			
		
		else if(this.thisnum == str.result())
			return 0;
		
		else 
			return -1;
		
		
	}
	
	public int result()
	{
		return thisnum;
	}
}
