package Question6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.geom.Line2D;


public class ScreenSaver extends JComponent {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int R,G,B;
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Random r = new Random();
		
		for(int i=0;i<100;++i){
			x1 = r.nextInt(300);
			x2 = r.nextInt(300);
			y1 = r.nextInt(300);
			y2 = r.nextInt(300);
			R = r.nextInt(256);
			G = r.nextInt(256);
			B = r.nextInt(256);
		Line2D.Double segment = new Line2D.Double(x1,y1,x2,y2);
		Color color = new Color(R,G,B);
		g2.draw(segment);
		g2.setColor(color);
		
				
		
		}
		repaint();
		
		
	}
		
}
