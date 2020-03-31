package Question8;
import java.util.Scanner;

public class StudentResult {
	private double[] arr;
	private double sum;
	
	public StudentResult() {
		// TODO Auto-generated constructor stub
		arr = new double[20];
		sum = 0.0;
	}
	
	public void PrintAverage()
	{
	
		Scanner in = new Scanner(System.in);
		System.out.println("Input Scores(20 Students)");
		for(int i=0;i<20;++i)
		{
			System.out.print(+(i+1)+" Student : ");
			arr[i] = in.nextDouble(); //input student score
			
		}
		
		System.out.println("Average of 20 Students");
		
		for(int i=0;i<20;++i)
			sum += arr[i]; //sum of all scores
		
		System.out.println(sum/20); //average of all scores
	
	}
	

}
