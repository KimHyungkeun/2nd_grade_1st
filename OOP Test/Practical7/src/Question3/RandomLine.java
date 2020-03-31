package Question3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.BasicStroke;



import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class RandomLine extends JComponent{
		private int x1;
		private int x2;
		private int y1;
		private int y2;
		private int R;
		private int G;
		private int B;
		private int thick;
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		Random generate = new Random();
		
		
		for(int i=0;i<5;++i){
		
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
		Line2D.Double segment = new Line2D.Double(x1,y1,x2,y2);
		g2d.setStroke(new BasicStroke(thick));
		g2d.draw(segment);
		g2d.setColor(magneta);
		
		}
		
		
		
		}
	
	
	
}
