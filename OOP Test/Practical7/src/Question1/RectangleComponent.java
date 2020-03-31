package Question1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{

	public void paintComponent(Graphics g)
	{
		//Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//Construct a rectangle and draw it
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		for(int i=0;i<10;++i){
		//Move rectangle 15 units to the right and 25 units down
		Rectangle box1 = new Rectangle(5+10*i,10+10*i,20+10*i,30+10*i);
		//Draw moved rectangle
		g2.draw(box1);
		}
		
	}

}
