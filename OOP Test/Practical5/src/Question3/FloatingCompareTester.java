package Question3;
import java.util.Scanner;

public class FloatingCompareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatingCompare info = new FloatingCompare();
		float num1,num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number 1 : ");
		num1 = in.nextFloat();	
		System.out.println("Input number 2 : ");
		num2 = in.nextFloat();
		
		info.Round(num1,num2);
		if(info.result() == true)
			System.out.println("They are the same when rounded to two decimal places");
		
		else
			System.out.println("They are different when rounded to two decimal places");
		
		
		if(info.differ() == true)
			System.out.println("They differ by less than 0.01");
	}

}
