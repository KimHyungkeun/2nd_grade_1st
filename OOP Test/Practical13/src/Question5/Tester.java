package Question5;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = " ";
		Scanner in = new Scanner(System.in);
		System.out.print("Input String(Until 80characters) : ");
		string = in.nextLine();
		
		Q5 test = new Q5(string);
		test.LengthCheck();
		

	}

}
