package Question7;
import java.util.Scanner;

public class LeapYearTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear info = new LeapYear();
		int year;
		Scanner in = new Scanner(System.in);
		System.out.println("Input Year : ");
		year = in.nextInt();
		
		if(true == info.isLeapYear(year))
			System.out.println("This year is Leapyear");
		
		else
			System.out.println("This year is not Leapyear");
	}

}
