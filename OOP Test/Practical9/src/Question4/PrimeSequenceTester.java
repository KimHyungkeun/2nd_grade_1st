package Question4;

import Question3.Sequence;
import java.util.Scanner;

public class PrimeSequenceTester{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner in = new Scanner(System.in);
		System.out.print("Input number : ");
		input = in.nextInt();
		
		Sequence x = new PrimeSequence(input);
		
		System.out.println("You Inputed "+x.nextPrime());
	}

}
