package Question1;
import java.util.Scanner;

public class Q1Tester{
	private static double[] num;
	public static void main(String[] args) 
	{
		double student;
		double maximum;
		// TODO Auto-generated method stub
		DataSet data = new DataSet();
		num = new double[5];
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<5;++i){
		System.out.println("Input Score : ");
		num[i] = in.nextDouble();
		data.add(new Q1(num[i]));
		}
		
		Measurable measure = data.getMaximum();
		
		System.out.println("Average = "+data.getAverage());
		student = data.getAverage();
		
		if (student >= 4.5)
			System.out.println("Average's Grade : A+");
			else if (4.3 <= student && student < 4.5)
				System.out.println("Average's Grade : A0");
			else if (4.0 <= student && student < 4.3)
				System.out.println("Average's Grade : A-");
			else if (3.5 <= student && student < 4.0)
				System.out.println("Average's Grade : B+");
			else if (3.3 <= student && student < 3.5)
				System.out.println("Average's Grade : B0");
			else if (3.0 <= student && student < 4.3)
				System.out.println("Average's Grade : B-");
			else
				System.out.println("Average's Grade : C");
		  
		  System.out.println("Highest score = "+measure.getMeasure());
		  maximum = measure.getMeasure();
		  
		  if (maximum >= 4.5)
				System.out.println("Highest's Grade : A+");
				else if (4.3 <= maximum && maximum < 4.5)
					System.out.println("Highest's Grade : A0");
				else if (4.0 <= maximum && maximum < 4.3)
					System.out.println("Highest's Grade : A-");
				else if (3.5 <= maximum && maximum < 4.0)
					System.out.println("Highest's Grade : B+");
				else if (3.3 <= maximum && maximum < 3.5)
					System.out.println("Highest's Grade : B0");
				else if (3.0 <= maximum && maximum < 4.3)
					System.out.println("Highest's Grade : B-");
				else
					System.out.println("Highest's Grade : C");
	}
	
	

}
