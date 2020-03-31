package Question7;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

class RandomRectangle extends JComponent{
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int R;
	private int G;
	private int B;
	private int thick;
	private int count;
	
	public RandomRectangle(int num)
	{
		count = num;
	}
		
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;
			Random generate = new Random();
			
			for(int i=0;i<count;++i){
				
				x1 = generate.nextInt(300);
				x2 = generate.nextInt(300);
				y1 = generate.nextInt(300);
				y2 = generate.nextInt(300);
				R = generate.nextInt(255);
				G = generate.nextInt(255);
				B = generate.nextInt(255);
				thick = generate.nextInt(20);
				 
				
				Color magneta = new Color(R,G,B);
				
				// draw a line in integer coordinates
				Rectangle box = new Rectangle(x1,y1,x2,y2);
				g2d.setStroke(new BasicStroke(thick));
				g2d.draw(box);
				g2d.setColor(magneta);
			
				}
				
		}
		
		
		
	}

public class Q7Tester {
	private static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane message = new JOptionPane();
		num = Integer.parseInt(message.showInputDialog("Input number\n"));
		
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		RandomRectangle rec = new RandomRectangle(num); 
		frame.add(rec);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
