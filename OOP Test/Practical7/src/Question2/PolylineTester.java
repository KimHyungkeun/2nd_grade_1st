package Question2;

import javax.swing.*;
import java.awt.*;

public class PolylineTester extends JFrame {

	public PolylineTester(){
        add(new Polyline());
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel policePanel = new Polyline();
		frame.add(policePanel);
		frame.setSize(300,200);
		frame.setTitle("Spiral");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
