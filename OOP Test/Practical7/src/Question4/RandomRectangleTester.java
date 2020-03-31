package Question4;

import javax.swing.JFrame;

import Question1.RectangleComponent;

public class RandomRectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomRectangle component = new RandomRectangle();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
