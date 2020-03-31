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


public class RobotParts extends JComponent implements dancingrobots{
	Line2D.Double leftarm;
	Line2D.Double rightarm;
	Line2D.Double leftleg;
	Line2D.Double rightleg;
	Rectangle.Double body;
	Rectangle.Double shirts;
	Rectangle.Double pants;
	Rectangle.Double tie;
	Ellipse2D.Double lefteye;
	Ellipse2D.Double leftblueeye;
	Ellipse2D.Double leftblackeye;
	Ellipse2D.Double righteye;
	Ellipse2D.Double rightblueeye;
	Ellipse2D.Double rightblackeye;
	
	Ellipse2D.Double lefteye2;
	Ellipse2D.Double leftblueeye2;
	Ellipse2D.Double leftblackeye2;
	Ellipse2D.Double righteye2;
	Ellipse2D.Double rightblueeye2;
	Ellipse2D.Double rightblackeye2;
	Line2D.Double leftarm2;
	Line2D.Double rightarm2;
	Line2D.Double leftleg2;
	Line2D.Double rightleg2;
	Rectangle.Double body2;
	Rectangle.Double shirts2;
	Rectangle.Double pants2;
	Rectangle.Double tie2;
	int X;//100
	int Y;//200
	int X2;//100
	int Y2;//200
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
	final int DELAY = 50;
	int lefthandx;
	int lefthandy;
	int righthandx;
	int righthandy;
	int leftlegx;
	int leftlegy;
	int rightlegx;
	int rightlegy;
	
	int lefthandx2;
	int lefthandy2;
	int righthandx2;
	int righthandy2;
	int leftlegx2;
	int leftlegy2;
	int rightlegx2;
	int rightlegy2;
	
    private boolean visible;
    private boolean visible2;
    private boolean done;
    Thread moveit;
    Thread moveit2;
	public RobotParts(int parX, int parY)
	{
		setPoints(parX, parY);
		setPoints2(parX,parY);
		visible = false;
		visible2 = false;
		done = false;
		move();
		move2();
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		if(visible)
		{
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
		g2.setColor(new Color(200,200,0));
		g2.setStroke(new BasicStroke(10));
		g2.draw(leftarm);
		g2.draw(rightarm);
		g2.draw(leftleg);
		g2.draw(rightleg);
		g2.setColor(Color.WHITE);
		g2.fill(lefteye);
		g2.fill(righteye);
		g2.setColor(Color.CYAN);
		g2.fill(leftblueeye);
		g2.fill(rightblueeye);
		g2.setColor(Color.BLACK);
		g2.fill(leftblackeye);
		g2.fill(rightblackeye);
		
		}
		
		if(visible2)
		{
		g2.setColor(Color.YELLOW);
		//g2.draw(body);
		g2.fill(body2);
		g2.setColor(new Color(102,0,0));
		//g2.draw(pants);
		g2.fill(pants2);
		g2.setColor(Color.WHITE);
		g2.fill(shirts2);
		g2.setColor(Color.RED);
		g2.fill(tie2);
		g2.setColor(new Color(200,200,0));
		g2.setStroke(new BasicStroke(10));
		g2.draw(leftarm2);
		g2.draw(rightarm2);
		g2.draw(leftleg2);
		g2.draw(rightleg2);
		g2.setColor(Color.WHITE);
		g2.fill(lefteye2);
		g2.fill(righteye2);
		g2.setColor(Color.CYAN);
		g2.fill(leftblueeye2);
		g2.fill(rightblueeye2);
		g2.setColor(Color.BLACK);
		g2.fill(leftblackeye2);
		g2.fill(rightblackeye2);
		}
	}
	
	public void move2()
	{
		moveit2 = new Thread()
		{
			public void run()
			{
				while(true)
				{
				if(done){			
					Random n = new Random();
					//n.nextInt(50);
					//double localleftlegx= (lefthandx-X)*(cos)+(lefthandy-Y-height/2)*(sin)+X;
					double localleftlegy = Y2+height+n.nextInt(50)+5;
					//double localrightlegx=(righthandx-X-width)*(cos)+(righthandy-Y-height/2)*(sin)+X+width;
					double localrightlegy = Y2+height+n.nextInt(50)+5;
					leftleg2.setLine(X2+width/3,Y2+height+5,leftlegx2,localleftlegy);
					rightleg2.setLine(X2+width/3*2,Y2+height+5,rightlegx2,localrightlegy);
					repaint();
				try {
					sleep(DELAY);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				else
					try {
						sleep(DELAY);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		moveit2.start();
	}
	public void move()
	{
		moveit = new Thread()
	{
		public void run()
		{
			while(true)
			{
			if(done){			
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
			
			try {
				sleep(DELAY);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else
				try {
					sleep(DELAY);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	};
	moveit.start();
		
	}
	
	public void setPoints(int parX, int parY)
	{
		X = parX;
		Y = parY;
	
			lefthandx = X-armlength;
			lefthandy = Y+height/2;
			righthandx = X+width+armlength;
			righthandy = Y+height/2;
	
		
		leftlegx = X+width/3;
		leftlegy = Y+height+leglength;
		rightlegx = X+width/3*2;
		rightlegy = Y+height+leglength;	
		lefteye = new Ellipse2D.Double(X+20,Y,30,30);
		leftblueeye = new Ellipse2D.Double(X+30+3,Y+6,15,15);
		leftblackeye = new Ellipse2D.Double(X+30+6,Y+10,8,8);
		righteye = new Ellipse2D.Double(X+55,Y,30,30);
		rightblueeye = new Ellipse2D.Double(X+60+3,Y+6,15,15);
		rightblackeye = new Ellipse2D.Double(X+60+6,Y+10,8,8);
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
	public void setPoints2(int parX, int parY)
	{
		X2 = parX;
		Y2 = parY;
		lefthandx2 = X2;
		lefthandy2 = Y2+height+10;
		righthandx2 = X2+width;
		righthandy2 = Y2+height+10;
		leftlegx2 = X2+width/3;
		leftlegy2 = Y2+height+leglength;
		rightlegx2 = X2+width/3*2;
		rightlegy2 = Y2+height+leglength;	
		
		lefteye2 = new Ellipse2D.Double(X2+20,Y2,30,30);
		leftblueeye2 = new Ellipse2D.Double(X2+30+3,Y2+6,15,15);
		leftblackeye2 = new Ellipse2D.Double(X2+30+6,Y2+10,8,8);
		righteye2 = new Ellipse2D.Double(X2+55,Y2,30,30);
		rightblueeye2 = new Ellipse2D.Double(X2+60+3,Y2+6,15,15);
		rightblackeye2 = new Ellipse2D.Double(X2+60+6,Y2+10,8,8);
		body2 = new Rectangle.Double(X2,Y2,width,height);
		pants2 = new Rectangle.Double(X2,Y2+80,pantswidth,pantsheight);
		shirts2 = new Rectangle.Double(X2,Y2+80,shirtswidth,shirtsheight);
		tie2 = new Rectangle.Double(X2+45,Y2+80,tiewidth,tieheight);
		
		leftarm2 = new Line2D.Double(X2,Y2+height/2,lefthandx2,lefthandy2);
		rightarm2 = new Line2D.Double(X2+width,Y2+height/2,righthandx2,righthandy2);
		
		leftleg2 = new Line2D.Double(X2+width/3,Y2+height+5,leftlegx2,leftlegy2);
		
		rightleg2 = new Line2D.Double(X2+width/3*2,Y2+height+5,rightlegx2,rightlegy2);
		
		repaint();
		//thread.start();
	}
	public boolean isHitIt(MouseEvent par)
	{
		if(par.getX()>=lefthandx&&par.getX()<=righthandx)
			{
			if(par.getY()>=Y&&par.getY()<=Y+height+leglength)
				return true;
			}
		return false;
	}
	public boolean isHitIt2(MouseEvent par)
	{
		if(par.getX()>=lefthandx2&&par.getX()<=righthandx2)
			{
			if(par.getY()>=Y2&&par.getY()<=Y2+height+leglength)
				return true;
			}
		return false;
	}
	public void letVisible()
	{
			visible= true;
			repaint();
	}
	public void letVisible2()
	{
			visible2= true;
			repaint();
	}
	@Override
	public void startdancing() {
		done = true;
		
	}
	@Override
	public void stopdancing() {
		done=false;
	}
	
	
}
