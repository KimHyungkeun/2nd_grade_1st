package Question5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import java.util.Scanner;

public class Circle extends JComponent{
	double r;
	double Diameter;
	double Circumference;
	double Area;
	
	public Circle()
	{
		System.out.print("Input r : ");
		Scanner in = new Scanner(System.in);
		r = in.nextDouble();
		
		Diameter = 2 * r;
		Circumference = 2 * Math.PI * r;
		Area = Math.PI * Math.pow(r,2);
	}
	
	public void paintComponent(Graphics g)
	{
		
		//Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//Construct a rectangle and draw it
		Ellipse2D.Double ellipse = new Ellipse2D.Double(10,10,r,r);
		g2.draw(ellipse);
		
		g2.drawString("Area ="+Area,10,60);
		g2.drawString("Diameter ="+Diameter,10,80);
		g2.drawString("Circumference ="+Circumference,10,100);
		
	}
}
