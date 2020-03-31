package Question5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonViewerTester {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;
	private static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=0;
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(2,1));
		JButton button = new JButton("Button");
		JLabel label = new JLabel("I was clicked    times");
		
		
		ActionListener listener = new ClickListener(label,n);
		button.addActionListener(listener);
		
		panel.add(button);
		panel.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setVisible(true);
	}

}

class ClickListener implements ActionListener
{	
	private int n;
	private JLabel label;
	public ClickListener(JLabel label,int n)
	{
		this.n = n;
		this.label = label;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		this.n++;
		this.label.setText("I was clicked "+this.n+" times");
		
	}
}
