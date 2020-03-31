package Question5;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		DataSet data = new DataSet();
		
		data.add(new Q5(4));
		data.add(new Q5(5));
		data.add(new Q5(6));
		data.add(new Q5(92));
		data.add(new Q5(34));
		
		
		Q5 max = (Q5) data.getMaximum();
		Q5 min = (Q5) data.getMinimum();
		
		System.out.println("Maximum = "+max.result());
		System.out.println("Minimum = "+min.result());
	}

}
