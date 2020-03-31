package Question2;


import javax.swing.*;

import java.awt.*;

public class Q2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
	    frame.setTitle("Printer");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Container container = frame.getContentPane();
	    container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
	    
	    
		
		
		JPanel panels = new JPanel();
		panels.setLayout(new GridLayout(3, 1));
		
		JPanel Checks = new JPanel();
		Checks.setLayout(new GridLayout(3, 1));
		JPanel Radios = new JPanel();
		Radios.setLayout(new GridLayout(3, 1));
		Checks.add(new JCheckBox("Image"));
		Checks.add(new JCheckBox("Text"));
		Checks.add(new JCheckBox("Code"));
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("Selection");
		JRadioButton r2 = new JRadioButton("All");
		JRadioButton r3 = new JRadioButton("Applet");
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		Radios.add(r1);
		Radios.add(r2);
		Radios.add(r3);
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Printer MyPrinter")); //빈칸?
		
		//col2 : 1 * 5 그리드로 하기?
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 5));
		panel2.add(new JTextArea());
		panel2.add(Checks);
		panel2.add(new JTextArea());
		panel2.add(Radios);
		panel2.add(new JTextArea());
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel3.add(new JLabel("Print Quality : "));
		String[] quality = {"High","Medium", "Low"};
		panel3.add(new JComboBox(quality));
		panel3.add(new JCheckBox("Print to File"));
		
		panels.add(panel1);
		panels.add(panel2);
		panels.add(panel3);
		
		//버튼 부분
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4, 1, 0, 5));
		buttons.add(new JButton("OK"));
		buttons.add(new JButton("Cancel"));
		buttons.add(new JButton("Setup..."));
		buttons.add(new JButton("Help"));
		
		container.add(panels);
		container.add(buttons);
	    
	    frame.setSize(600, 300);
	    frame.setVisible(true);
	}

}
