package Question3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.*;
import javax.management.timer.Timer;

public class Q3 extends JComponent implements MouseListener{
	private JFrame frame = new JFrame();
	private JLabel label;
	private int hour;
	private int minute;
	private int second;
	
	public Q3() {
		// TODO Auto-generated constructor stub
		Date date = new Date();
		hour = date.getHours();
		minute = date.getMinutes();
		second = date.getSeconds();
		
		Timer timer = new Timer();
		timer.start();
		
		label = new JLabel();
		
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		frame.add(label,BorderLayout.CENTER);
		
		frame.setTitle("Moving clock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.GREEN);
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked!");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released!");
		
	}
	
	

}
