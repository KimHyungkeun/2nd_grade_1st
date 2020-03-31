package Question7;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawCircleTester {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("Draw");
		JPanel panel = new JPanel();
		DrawCircle circle = null;
		panel.add(button);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setVisible(true);
		
		ActionListener listener = new ClickListener(circle);
		button.addActionListener(listener);
		
		
	}

}

class ClickListener implements ActionListener
{	private DrawCircle circle;
	public ClickListener(DrawCircle circle)
	{
		this.circle = circle;
	}
	public void actionPerformed(ActionEvent event)
	{
		JFrame frame = new JFrame();
		DrawCircle circle = new DrawCircle();
		frame.add(circle);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}
