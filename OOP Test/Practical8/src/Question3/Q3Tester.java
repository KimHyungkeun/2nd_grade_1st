package Question3;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class Q3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		JFrame frame = new JFrame();
	    frame.setTitle("Week9");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    Scanner in = new Scanner(System.in);
	    System.out.print("Please enter your name : ");
	    name = in.nextLine();
	    
	    JLabel label = new JLabel("GoodDay! "+name);
	    label.setFont(new Font("Courier New", Font.BOLD, 50));
	    label.setForeground(Color.BLACK);
	    
	   
	    frame.add(label);
	    frame.pack();
	    frame.setSize(500, 200);
	    frame.setVisible(true);
	}

}
