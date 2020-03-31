package Question5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;


public class CarTester extends JComponent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		
		frame.setSize(300,400);
		frame.setTitle("One Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final CarComponent component = new CarComponent();
		frame.add(component);
		
		frame.setVisible(true);
		
		class TimerListener implements ActionListener
	      {
	         
			public void actionPerformed(ActionEvent event)
	         {
				
	        	 component.moveBy(1);
	         }
	      }

	      ActionListener listener = new TimerListener();

	      final int DELAY = 100; // Milliseconds between timer ticks
	      Timer t = new Timer(DELAY, listener);
	      t.start();      

	}

}
