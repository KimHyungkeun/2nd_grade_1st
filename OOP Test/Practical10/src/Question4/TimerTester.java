package Question4;

import javax.swing.*;

import java.awt.GridLayout;
import java.util.*;
public class TimerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		
		JFrame frame = new JFrame();
		JLabel label = new JLabel(now.toString());
		JPanel panel = new JPanel();
		panel.add(label);
		frame.add(panel);
		
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
