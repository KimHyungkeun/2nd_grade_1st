package Homework2;

import javax.swing.*;
import java.awt.*;

public class Temperature_Fah extends JComponent{
	
		private Graphics2D g2;
		private int x = 70;
		private int y = 80;
		private int width = 10;
		private int height = 50;
		
		
		public void paintComponent(Graphics g)
		{
			g2 = (Graphics2D) g;
			g2.setColor(Color.BLUE);
			g2.fillOval(64, 129, 22, 25); 
			
			g2.drawRect(70, 30, 10, 120); //x,y,width,height
			g2.fillRect(x, y, width, height); //x,y,width,height
			
			g2.setColor(Color.BLUE);
			g2.drawString("Fahrenheit", 5, 15);
			g2.setColor(Color.BLACK);
			g2.drawString("212.0",85,35);
			g2.drawString("176.0",85,55);
			g2.drawString("140.0",85,75);
			g2.drawString("104.0",85,95);
			g2.drawString("68.0",85,115);
			g2.drawString("32.0",85,135);
		}
		
		public void Change(int Cel) //change the temperature
		{
			if(Cel <= 0)
			{
				y = 130;
				height = 0;
				repaint();
			}
				
			else{
			height = Cel;
			y = (100 - Cel) + 30;
			repaint();
			}
		}
}

