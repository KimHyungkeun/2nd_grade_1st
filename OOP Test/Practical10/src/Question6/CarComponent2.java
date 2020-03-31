package Question6;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent2 extends JComponent{
	private int x1;
	private int x2;
	private Car2 car1;
	private Car2 car2;
	public CarComponent2()
	{
		x1 = 0;
		x2 = 240;
		
		car1 = new Car2(x1,320);
		car2 = new Car2(x2,280);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		car1.draw(g2,x1);
		car2.draw(g2,x2);
		
	}
	
	public void moveBy(int dx1,int dx2)
	{
		x1 = x1 + dx1;
		x2 = x2 - dx2;
		repaint();
	}
	
	

}

