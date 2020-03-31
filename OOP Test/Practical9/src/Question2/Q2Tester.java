package Question2;
import java.util.Scanner;

public class Q2Tester {
	private static double[] num;
	private static String[] name  = {"Mike","Max","Andy","Harry","Susan"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet data = new DataSet();
		num = new double[5];
		int index = 0;
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<5;++i){
		System.out.println("Input Height of "+name[i]);
		num[i] = in.nextDouble();
		data.add( new Q2(num[i], name[i]));
		}
		
		Measurable measure = data.getMaximum();
		for(int i=0;i<5;++i){
			if(num[i] == measure.getMeasure())
			{
				index = i;
				break;
			}
		}
		
		System.out.println("Average = "+data.getAverage());
		System.out.println("Tallest Student : "+name[index]);
		
	}

}
