package Question5;

import Question5.Comparable;

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
			maximum = x;
			minimum = x;
		}
		
		else if(maximum.compareTo(x) > 0)
			maximum = x;
		
		else if(minimum.compareTo(x) < 0)
			minimum = x;
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

