package Question5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class ChangeMPG
{
	private double Miles;
	private double Gallons;
	private double MPG;
	public ChangeMPG(double Miles,double Gallons)
	{
		this.Miles = Miles;
		this.Gallons = Gallons;
	}
	
	public double result()
	{
		MPG = this.Miles / this.Gallons;
		return MPG;
	}
}

public class Q5Tester {

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 100;
	
	private static double Miles;
	private static double Gallons;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("Add Miles");
		Scanner in = new Scanner(System.in);
		System.out.print("Input Miles : ");
		Miles = in.nextDouble();
		System.out.print("Input Gallons : ");
		Gallons = in.nextDouble();
		ChangeMPG account = new ChangeMPG(Miles,Gallons);
		final JLabel label = new JLabel("MPG = " + account.result());
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		
		class ClickListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				ChangeMPG account = new ChangeMPG(Miles++,Gallons);
				label.setText("MPG = " + account.result());
			}
		}
		
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}


}
