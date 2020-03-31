package Question6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class CarTester2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		
		frame.setSize(300,400);
		frame.setTitle("Two Cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final CarComponent2 component = new CarComponent2();
		frame.add(component);
		
		frame.setVisible(true);
		class TimerListener implements ActionListener
	      {
	         @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent event)
	         {
	        	 component.moveBy(1,1);
	        	 
	         }
	      }

	      ActionListener listener = new TimerListener();
	      final int DELAY = 1; // Milliseconds between timer ticks
	      Timer t = new Timer(DELAY, listener);
	      t.start();      
}

}
