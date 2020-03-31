package Question4;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		/*Scanner in = new Scanner(System.in);
		String string;
		
		System.out.println("Enter your Message");
		string = in.nextLine();
		
		Q4 test = new Q4(string);
		
		frame.add(test);*/
		frame.setBackground(Color.BLACK);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Random Text");
		frame.setVisible(true);
		
	}

}
