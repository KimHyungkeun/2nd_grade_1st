package Question7;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class DrawCircle extends JComponent{
	private double x;
	private double y;
	private double radius;
	
	JOptionPane pane = new JOptionPane();
	
	public DrawCircle()
	{
		x = Double.parseDouble(pane.showInputDialog("Input x"));
		y = Double.parseDouble(pane.showInputDialog("Input y"));
		radius = Double.parseDouble(pane.showInputDialog("Input Radius"));
		
		x = x-(radius);
		y = y-(radius);
	}
	
	public void paintComponent(Graphics g)
	{	
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ellipse = new Ellipse2D.Double(x,y,radius*2,radius*2);
		g2.draw(ellipse);
	}
	
}
