package Question4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class Q4 extends JComponent{
	private JFrame frame = new JFrame();
	private JLabel label;
	private String thisstring;
	private Graphics2D g2;
	private int ran_x;
	private int ran_y;
	private int R,G,B;
	
	public Q4(String string) {
		// TODO Auto-generated constructor stub
		thisstring = string;
	}
	
	public void paintComponent(Graphics g)
	{
		g2 = (Graphics2D) g;
		g2.setBackground(Color.BLACK);
		Random random = new Random();
		ran_x = random.nextInt(500);
		ran_y = random.nextInt(500);
		
		R = random.nextInt(256);
		G = random.nextInt(256);
		B = random.nextInt(256);
		
		
	
		g2.setColor(new Color(R,G,B));
		g2.drawString(thisstring,ran_x,ran_y);
	    repaint();
		
	}

}
