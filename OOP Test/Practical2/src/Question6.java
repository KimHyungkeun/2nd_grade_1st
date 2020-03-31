import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner in;
		in = new Scanner(System.in);
		
		System.out.println("Please enter the String");
		input = in.nextLine();
		System.out.print("CAPITAL LETTER : ");
		System.out.println(input.toUpperCase()); //Change to Capital
		System.out.print("SMALL CAPITAL LETTER : ");
		System.out.println(input.toLowerCase()); // Change to small letter
		System.out.print("Number of Characters : ");
		System.out.println(input.length()); //length of String
		System.out.print("AFTER REPLACEMENT : ");
		System.out.println(input.replace('o', 'k'));
	}

}
