package Question5;

public class Q5 implements Comparable{
private int thisnum;
	
	public Q5(int num)
	{
		thisnum = num;
	}
	
	
	public int compareTo(Object other)
	{
		Q5 str = (Q5) other;
		
		if(this.thisnum == str.result())
			return 0;

		else if(this.thisnum > str.result())
			return -1;
		
		else
			return 1;
	}
	
	public int result()
	{
		return thisnum;
	}
	

}
