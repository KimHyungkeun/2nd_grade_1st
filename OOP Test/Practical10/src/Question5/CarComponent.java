package Question5;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JComponent;

public class CarComponent extends JComponent{
	private Car car1;
	private int x;
	private int y;
	public CarComponent()
	{
		x = getWidth();
		y = getHeight();
		car1 = new Car(0,320);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		car1.draw(g2,x);
    }
	
	public void moveBy(int dx)
	{
		x = x + dx;
		repaint();
	}
	
}
