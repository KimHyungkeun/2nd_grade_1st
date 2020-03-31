package Question4;

import Question3.Sequence;

public class PrimeSequence implements Sequence{
	private int num;
	public PrimeSequence(int input) {
		// TODO Auto-generated constructor stub
		num = input;
	}
	
	public int nextPrime()
	{
		for (int i = 1; i < num; i++ )
		{
			int j;
	           for (j=2; j<i; j++)
	           {
	           int k = i%j;
	           
	           if (k==0)
	            break;
	           }
	           
	           if(i == j)
	           {
	           System.out.print("  "+i);             
	           }               
	    }
		    System.out.println();
	        return num;       
	
	}

}
