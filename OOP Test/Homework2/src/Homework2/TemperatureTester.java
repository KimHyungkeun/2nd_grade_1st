package Homework2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TemperatureTester {
	private static JFrame frame;
	private static JPanel totalpanel;
	private static JPanel panel1;
	private static JPanel panel2;
	private static JPanel panel3;
	private static JTextField tf_Cel; //input Cel
	private static JTextField tf_Fah; //input Fah
	private static JButton button_Cel; //Button about Cel
	private static JButton button_Fah; //Button about Fah
	
	private static Temperature component_Cel; //class about Celsius Temperature
	private static Temperature_Fah component_Fah; //class about Fahrenheit Temperature
	
	private final static int WEDTH = 400; //Frame WEDTH
	private final static int HEIGHT = 400; //Frame HEIGHT
	
	static double Cel; //value of Celsius
	static double Fah; //value of Fahrenheit
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1; // input label1
		String str2; // input label2
		String str3; // input label3
		
		frame = new JFrame();
		totalpanel = new JPanel(new GridLayout(2,1)); //total panel
		
		
		tf_Cel = new JTextField(10); //TextField of Celsius
		tf_Fah = new JTextField(10); //TextField of Fahrenheit
	
		
		
		JLabel label1 = new JLabel("Convert to\n");
		str1 = label1.getText();
		JLabel label2 = new JLabel(" Celcius");
		str2 = label2.getText();
		JLabel label3 = new JLabel(" Fahrenheit");
		str3 = label3.getText();
		JLabel label_blank1 = new JLabel("2015 May 22 OOP Homework2"); //blank label1
		JLabel label_blank2 = new JLabel("Kim Hyungkeun"); //blank label2
		
		
		//Setting Button
		button_Cel = new JButton(str1+str2);
		button_Fah = new JButton(str1+str3);
	
		
		//Setting Temperature
		component_Cel = new Temperature();
		component_Fah = new Temperature_Fah();
		
		//Setting Panel1
		panel1 = new JPanel(new GridLayout(1,2));
		panel1.add(component_Fah);
		panel1.add(component_Cel);
		
		//Setting Panel2
		panel2 = new JPanel(new GridLayout(4,2));
		panel2.add(tf_Cel);
		panel2.add(button_Cel);
		panel2.add(tf_Fah);
		panel2.add(button_Fah);
		panel2.add(label_blank1);
		panel2.add(label_blank2);
		
		
		
		
		//Setting TotalPanel
		totalpanel.add(panel1);
		totalpanel.add(panel2);
		frame.add(totalpanel);
		
		//If you click 'Convert to Celsius' then, activate under class
		 class ClickCelsius implements ActionListener
		    { 
			 private JTextField result;
			 public ClickCelsius(JTextField tf_Fah)
			 {
				 result = tf_Fah;
			 }

		    	public void actionPerformed (ActionEvent event)
		    	{
		    		 Fah = Double.parseDouble(tf_Cel.getText());
		    		 Cel =  (double)5/9 * (Fah-32);
		    		result.setText(Double.toString(Cel));
		             component_Cel.Change((int)Cel);
		             component_Fah.Change((int)Cel);
		        }
		    	
		    }
		
		 //If you click 'Convert to Fahrenheit' then, activate under class
		 class ClickFahren implements ActionListener
		    {
			 private JTextField result;
			 public ClickFahren(JTextField tf_Cel)
			 {
				 result = tf_Cel;
			 }

		    	public void actionPerformed (ActionEvent event)
		    	{
		    		Cel = Double.parseDouble(tf_Fah.getText());
		    		Fah = (double)9/5 * Cel + 32;
		            result.setText(Double.toString(Fah));
		            component_Cel.Change((int)Cel);
		            component_Fah.Change((int)Cel);
		            
		        }
		    	
		    }
		    
		ActionListener listener1 = new ClickCelsius(tf_Fah);
		button_Cel.addActionListener(listener1);
		
		ActionListener listener2 = new ClickFahren(tf_Cel);
		button_Fah.addActionListener(listener2);
		
		frame.setTitle("Temperature Test");
		frame.setSize(WEDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	

}
