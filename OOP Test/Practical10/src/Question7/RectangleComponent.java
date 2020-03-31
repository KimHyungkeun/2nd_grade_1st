package Question7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Point;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{
		private Rectangle box;
	    private int x_p;
	    private int y_p;
	    private int x;
	    private int y;
	    private boolean able_goX;
	    private boolean able_goY;
	    
	    public RectangleComponent()
	    {
	    	x = 0;
	    	y = 0;
	    	x_p = 0;
	    	y_p = 0;
	    	able_goX = true;
			able_goY = true;
	    }
	   public void paintComponent(Graphics g)
	      {  
	         // Recover Graphics2D
	         Graphics2D g2 = (Graphics2D) g;
	   
	         // Construct a rectangle and draw it
	         box = new Rectangle(x, y, 20, 30);
	         g2.draw(box);
	         
	           
	         }
	   
	   public void moveBy(int dx,int dy)
	   {
		   Point p = box.getLocation();
		   x_p = p.x;
		   y_p = p.y;
		  
		   
		   if(able_goX == true && able_goY == true){ //1
			   x = x + dx;
			   y = y + dy;
			   repaint();
			   
			   if(x_p >= getWidth() - box.getWidth()) //if rec exceed frame, then change false
				   able_goX = false;
			   
			   if( y_p  >= getHeight() - box.getHeight()) //if rec exceed frame, the x change true and y change false
			   {
				   able_goX = true;
				   able_goY = false;
			   }
			   
			   
			   if(x_p == getWidth() - box.getWidth() && y_p == getHeight() - box.getHeight()) 
				   able_goY = false;
		   }
		  
		   
		   else if(able_goX == false && able_goY == true){ //2
			   x = x - dx;
		   	   y = y + dy;
		   	   repaint();
		   	  
		   	   if( y_p  >= getHeight() - box.getHeight())
		   		   able_goY = false;
		   	   
		       if(x_p <= 0)
		       {
				   able_goX = true;
				   able_goY = true;
		       }
		   	   
		   	   
		   	   if(x_p == 0 && y_p == getHeight() - box.getHeight() )
		   		   able_goX = true;
		   }
		   
		   else if(able_goX == false && able_goY == false){ //3
			   x = x - dx;
			   y = y - dy;
			   repaint();
			   
			   if(x_p <= 0)
		   		   able_goX = true;
			   
			   if(y_p <= 0)
			   {
				   able_goX = false;
				   able_goY = true;
			   }
			   
			   if(x_p == 0 && y_p == 0)
				   able_goY = true;
		   }
		   
		   else if(able_goX == true && able_goY == false){ //4
			   x = x + dx;
			   y = y - dy;
			   repaint();
			   
			   if(y_p <= 0)
		   		   able_goY = true;
			   
			   if(x_p == getWidth() - box.getWidth())
			   {
				   able_goX = false;
				   able_goY = false;
			   }
			   
			   
			   if(x_p == getWidth() - box.getWidth() && y_p == 0)
				   able_goX = false;
		   }
		   
		  
		   System.out.println("("+x_p+","+y_p+")"+able_goX+" "+able_goY);
	   }
	   
}
