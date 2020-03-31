package Question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		PrintWriter out = null;
		
		out = new PrintWriter("output.txt");
		out.println("Hello, My first program in.File");
		out.close();
	}

}
