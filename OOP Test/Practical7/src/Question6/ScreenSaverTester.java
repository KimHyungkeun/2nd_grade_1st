package Question6;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
 import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class DrawFrame extends JFrame {
	  public DrawFrame() {
	    ScreenSaver component = new ScreenSaver();
	    add(component);
	  }
}

public class ScreenSaverTester extends JFrame {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        DrawFrame frame = new DrawFrame();
			
			frame.setSize(300, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setVisible(true);
		
			}
}
