package Question5;

import java.awt.Component;

import javax.swing.JFrame;

import Question1.RectangleComponent;

public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("Radius");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Circle circle = new Circle();
		frame.add(circle);
		
		frame.setVisible(true);
	}

}
