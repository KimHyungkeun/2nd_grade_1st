package Question1;

import java.awt.geom.Line2D;

import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;

public class Q1Tester {

	
public static void main(String[] args) {

	
		JFrame frame = new JFrame();
	    frame.setTitle("Align");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container=frame.getContentPane();
	    container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
	    
	    JPanel panel1 = new JPanel(new GridLayout(2,1));
	    JCheckBox box1 = new JCheckBox("Snap to Grid");
	    JCheckBox box2 = new JCheckBox("Show Grid");
	    panel1.add(box1);
	    panel1.add(box2);
	    
	    
	    JPanel panel2 = new JPanel(new GridLayout(2,1));
	    JLabel label1 = new JLabel("X :");
	    JLabel label2 = new JLabel("Y :");
	    panel2.add(label1);
	    panel2.add(label2);
	    
	    JPanel panel3 = new JPanel(new GridLayout(2,1));
	    JTextField text1 = new JTextField("8",6);
	    JTextField text2 = new JTextField("8",6);
	    panel3.add(text1);
	    panel3.add(text2);
	    
	    JPanel panel4 = new JPanel(new GridLayout(3,1));
	    JButton button1 = new  JButton("OK");
	    JButton button2 = new  JButton("Cancel");
	    JButton button3 = new  JButton("Help");
	    panel4.add(button1);
	    panel4.add(button2);
	    panel4.add(button3);
	    
	  
	    container.add(panel1);
	    container.add(panel2);
	    container.add(panel3);
	    container.add(panel4);
		frame.setSize(400, 200);
	    frame.setVisible(true);
		
	}

}
