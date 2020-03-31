package Question8;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = null;
		int sum = 0;
		int chance = 2;
		System.out.println("Input number");
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
		try
		{
		input = in.next();
		sum += Integer.parseInt(input);
		}
		
		catch(NumberFormatException exception)
		{
			chance--;
			System.out.println("Input was not a number");
			if(chance == 0)
			{
				System.out.println("Sum = "+sum);
				System.out.println("System off");
				return;
			}
		}
		
		}
	}

}
