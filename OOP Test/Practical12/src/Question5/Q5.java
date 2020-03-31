package Question5;

import Question4.Q4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q5 {
	
	private static String string;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		string = " ";
		File outputfile = new File("output.txt");
		Scanner in = new Scanner(outputfile);
		string = in.nextLine();
		in.close();
		
		System.out.println(string);
		System.out.println("Total Character :"+string.length());
	}

}
