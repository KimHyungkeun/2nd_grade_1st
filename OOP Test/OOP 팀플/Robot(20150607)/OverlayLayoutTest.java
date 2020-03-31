package Assignment;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class OverlayLayoutTest {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Overlay Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel() {
      public boolean isOptimizedDrawingEnabled() {
        return false;
      }
    };
    LayoutManager overlay = new OverlayLayout(panel);
    panel.setLayout(overlay);

    JButton button1 = new JButton("Small");
    button1.setMaximumSize(new Dimension(25, 25));
    button1.setBackground(Color.white);
    button1.setAlignmentX(0.5f);
    button1.setAlignmentY(0.5f);    
    panel.add(button1);
    
    JButton button2 = new JButton("Medium");
    button2.setMaximumSize(new Dimension(50, 50));
    button2.setBackground(Color.gray);
    button2.setAlignmentX(0.5f);
    button2.setAlignmentY(0.5f);
    panel.add(button2);
    
    JButton button3 = new JButton("Large");
    button3.setMaximumSize(new Dimension(100, 100));
    button3.setBackground(Color.black);
    button3.setAlignmentX(0.5f);
    button3.setAlignmentY(0.5f);
    panel.add(button3);    

    frame.add(panel, BorderLayout.CENTER);
  

    frame.setSize(400, 300);
    frame.setVisible(true);
  }
}