package Question6;

import Question6.Comparable;

public class DataSet{

	private int sum;
	private int count;
	private Comparable maximum;
	private Comparable minimum;

	
	public DataSet() {
		// TODO Auto-generated constructor stub
		sum=0;
		count=0;
		maximum = null;
		minimum = null;
		
	}
	
	public void add(Comparable x)
	{
		if(minimum == null)
		{
			minimum = x;
			maximum = x;
		}
		
		else if(minimum.compareTo(x) < 0)
			minimum = x;
		
		else 
			maximum = x;
	}
	
	
	public Comparable getMaximum()
	{
		return maximum;
	}
	
	public Comparable getMinimum()
	{
		return minimum;
	}

	

}


