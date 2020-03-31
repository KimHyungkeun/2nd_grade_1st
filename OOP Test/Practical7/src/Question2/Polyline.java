package Question2;

import javax.swing.*;
import java.awt.*;

public class Polyline extends JPanel {
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        
    // Draw a Polyline
        int xValues2[] = { 200, 200, 175, 150, 150, 175, 200, 225 ,225 ,175,125,125,175,225,275};
        int yValues2[] = { 200, 250, 275, 250, 200, 175, 175, 200 ,250, 300,250,200,150,150,200};
        g.drawPolyline( xValues2, yValues2, 15); 

      
    }   
}
