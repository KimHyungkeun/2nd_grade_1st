package Question2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawCircle extends JFrame implements MouseListener{
	private int[] x;
	private int[] y;
	private int radius;
	private int i;
	
	public DrawCircle()
	{
		x = new int[2];
    	y = new int[2];
		i=0;
		
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
	}
	
  public void paint(Graphics g)
	{
	  	
		g.drawOval(x[0] - radius,y[0] - radius, radius*2,radius*2);
		
	}
  
  @Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x[i] = e.getX();
		y[i] = e.getY();
		System.out.println("(x,y)"+x[i]+","+y[i]);
		System.out.println(i);
		i++;
		if(i==2)
		{
			radius = cal_radius();
			repaint();
			i=0;
		}
	
    }

	@Override
	public void mouseEntered(MouseEvent e){}
  @Override
	public void mouseExited(MouseEvent e) {}
  @Override
	public void mousePressed(MouseEvent e) {}
  @Override
	public void mouseReleased(MouseEvent e) {}
  
  public int cal_radius()
  {
  	return (int) Math.sqrt(Math.pow(x[1]-x[0], 2) + Math.pow(y[1]-y[0], 2));
  }
	
	
}








