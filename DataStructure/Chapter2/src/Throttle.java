
public class Throttle {
	private int top;
	private int position;
	
	public Throttle(int size)
	{
		if(size <= 0)
			throw new IllegalArgumentException("Size <= 0: " + size);
		top = size;
	}
	
	public double getFlow()
	{
		return (double)position / (double)top;
	}
	
	public boolean isOn()
	{
		return (getFlow()>0);
	}
	
	public void shift(int amount)
	{
		if (amount > top - position)
			position = top;
		else if(position + amount < 0)
			position = 0;
		else
			position += amount;
		
		System.out.println("top : "+top +" position : "+position);
	}
	
	public void shutOff()
	{
		position = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throttle t1;
		Throttle t2;
		t1 = new Throttle(100);
		t1.shift(25);
		t2 = t1;
		t2.shift(-5);

	}

}
