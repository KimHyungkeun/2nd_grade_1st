package Question6;

public class Tester {
	
	public static void main(String[] args)
	{
		DataSet data = new DataSet();
		
		data.add(new Coin(500));
		data.add(new Coin(100));
		data.add(new Coin(50));
		data.add(new Coin(10));
		
		Coin max = (Coin) data.getMaximum();
		Coin min = (Coin) data.getMinimum();
		
		System.out.println("Maximum = "+max.result());
		System.out.println("Minimum = "+min.result());
	}
}
