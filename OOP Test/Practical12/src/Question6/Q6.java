package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File inputfile = new File("babynames.txt");
		Scanner in = new Scanner(inputfile);
		
		
		PrintWriter boys = new PrintWriter("boynames.txt");
		PrintWriter girls = new PrintWriter("girlnames.txt");
		while(in.hasNext())
		{
		boys.println(in.nextLine());
		girls.println(in.nextLine());
		}
		boys.close();
		girls.close();
		
		
in.close();
	}

}
