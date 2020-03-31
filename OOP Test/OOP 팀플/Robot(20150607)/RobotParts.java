package Assignment;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;


public class RobotParts extends JComponent{

	Line2D.Double leftarm;
	Line2D.Double rightarm;
	Line2D.Double leftleg;
	Line2D.Double rightleg;
	
	Ellipse2D.Double head;
	
	Rectangle.Double body;
	Rectangle.Double shirts;
	Rectangle.Double pants;
	Rectangle.Double tie;
	int X;//100
	int Y;//200
	final int width = 100;
	final int height = 100;
	final int pantswidth = 100;
	final int pantsheight = 20;
	final int shirtswidth = 100;
	final int shirtsheight = 10;
	final int tiewidth = 10;
	final int tieheight = 10;
	final int leglength = 40;
	final int armlength = height/2;
	
	int lefthandx;
	int lefthandy;
	int righthandx;
	int righthandy;
	int leftlegx;
	int leftlegy;
	int rightlegx;
	int rightlegy;
	
	
	/*class TheThread extends Thread
	{
		
		public void run()
		{
			
			
		}
	}
	TheThread thread;*/
	
	public RobotParts(int parX, int parY, boolean what)
	{
		//thread = new TheThread();
		setPoints(parX, parY, what);
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.YELLOW);
		//g2.draw(body);
		g2.fill(body);
		
		g2.setColor(new Color(102,0,0));
		//g2.draw(pants);
		g2.fill(pants);
		g2.setColor(Color.WHITE);
		g2.fill(shirts);
		g2.setColor(Color.RED);
		g2.fill(tie);
		g2.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(10));
		g2.draw(leftarm);
		g2.draw(rightarm);
		g2.draw(leftleg);
		g2.draw(rightleg);
		
	}
	
	public void move()
	{
		Random n = new Random();
		double cos = n.nextDouble();
		double sin = Math.sqrt(1-cos*cos);
		if(n.nextInt(2)==0)
			sin = -sin;
		
		double locallefthandx= (lefthandx-X)*(cos)+(lefthandy-Y-height/2)*(sin)+X;
		double locallefthandy= -(lefthandx-X)*(sin)+(lefthandy-Y-height/2)*(cos)+Y+height/2;
		double localrighthandx=(righthandx-X-width)*(cos)+(righthandy-Y-height/2)*(sin)+X+width;
		double localrighthandy = -(righthandx-X-width)*(sin)+(righthandy-Y-height/2)*(cos)+Y+height/2;
		
		leftarm.setLine(X,Y+height/2,locallefthandx,locallefthandy);
		rightarm.setLine(X+width,Y+height/2,localrighthandx,localrighthandy);
		repaint();
	}
	public void move2()
	{
		Random n = new Random();
		//n.nextInt(50);
		//double localleftlegx= (lefthandx-X)*(cos)+(lefthandy-Y-height/2)*(sin)+X;
		double localleftlegy = Y+height+n.nextInt(50)+5;
		//double localrightlegx=(righthandx-X-width)*(cos)+(righthandy-Y-height/2)*(sin)+X+width;
		double localrightlegy = Y+height+n.nextInt(50)+5;
		leftleg.setLine(X+width/3,Y+height+5,leftlegx,localleftlegy);
		rightleg.setLine(X+width/3*2,Y+height+5,rightlegx,localrightlegy);
		repaint();
	}
	
	public void setPoints(int parX, int parY, boolean what)
	{
		X = parX;
		Y = parY;
		if(what)
			lefthandx = X-armlength;
		else
			lefthandx = X;
		
		if(what)
			lefthandy = Y+height/2;
		else
			lefthandy = Y+height+10;
		
		if(what)
			righthandx = X+width+armlength;
		else
			righthandx = X+width;
		/*
		if(what)
			righthandy = Y+height*/
		if(what)
			righthandy = Y+height/2;
		else
			righthandy = Y+height+10;
		
		
		leftlegx = X+width/3;
		leftlegy = Y+height+leglength;
		rightlegx = X+width/3*2;
		rightlegy = Y+height+leglength;	
		
		body = new Rectangle.Double(X,Y,width,height);
		pants = new Rectangle.Double(X,Y+80,pantswidth,pantsheight);
		shirts = new Rectangle.Double(X,Y+80,shirtswidth,shirtsheight);
		tie = new Rectangle.Double(X+45,Y+80,tiewidth,tieheight);
		
		leftarm = new Line2D.Double(X,Y+height/2,lefthandx,lefthandy);
		rightarm = new Line2D.Double(X+width,Y+height/2,righthandx,righthandy);
		
		leftleg = new Line2D.Double(X+width/3,Y+height+5,leftlegx,leftlegy);
		rightleg = new Line2D.Double(X+width/3*2,Y+height+5,rightlegx,rightlegy);
		repaint();
		//thread.start();
	}
	
	public boolean isHitIt(MouseEvent par)
	{
		if(par.getX()>=lefthandx&&par.getX()<=righthandx)
			{
			if(par.getY()>=Y&&par.getY()<=Y+height+10)
				return true;
			}
		return false;
	}
	
}
