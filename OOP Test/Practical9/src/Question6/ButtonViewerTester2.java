package Question6;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewerTester2 {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;
	private static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(2,2));
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JLabel label1 = new JLabel("I was clicked   times");
		JLabel label2 = new JLabel("I was clicked   times");
		n=0;
		
		ActionListener listener1 = new ClickListener(label1,n);
		btn1.addActionListener(listener1);
		
		ActionListener listener2 = new ClickListener(label2,n);
		btn2.addActionListener(listener2);
		
		panel.add(btn1);
		panel.add(label1);
		panel.add(btn2);
		panel.add(label2);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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

class ClickListener2 implements ActionListener
{	
	private int n;
	private JLabel label;
	public ClickListener2(JLabel label,int n)
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