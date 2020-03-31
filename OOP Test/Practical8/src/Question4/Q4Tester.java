package Question4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JLabel;

class ChangeF
{
	private double C;
	private double Fahrenheit;
	public ChangeF(double celcius)
	{
		C = celcius;
	}
	
	public double result()
	{
		Fahrenheit = (double)9/5 * C +32;
		return Fahrenheit;
	}
}

public class Q4Tester {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		JTextField tf = new JTextField(10);
	    JLabel label = new JLabel("Enter the Reading in Celsius ");
	    JLabel label2 = new JLabel("Fahrenheit = ");
	    JButton btn = new JButton("Convert");
	    
	    panel.add(label,BorderLayout.NORTH);
	    panel.add(tf);
	    panel.add(btn);
	    panel.add(label2);
	    frame.add(panel);
	    
	    class ClickListener implements ActionListener
	    {

	    	public void actionPerformed (ActionEvent event)
	    	{
	    		double celcius = Double.parseDouble(tf.getText());
	            ChangeF result = new ChangeF(celcius);
	            label2.setText("Fahrenheit = " +result.result() +"F");
	        }
	    	
	    }
	    
	    ActionListener listener = new ClickListener();
		btn.addActionListener(listener);
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
	    frame.setVisible(true);
	    
	    
	    

	}

}
