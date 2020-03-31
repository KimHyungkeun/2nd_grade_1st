package Question8;

import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.*;
import java.util.Random;



public class Q8Tester {
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 300;
	static Color color = new Color(255,0,0);
	static DrawRectangle component = new DrawRectangle(color);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		//frame.setLayout(null);
		JButton button = new JButton("Change Color");
		JRadioButton red = new JRadioButton("RED");
		JRadioButton green = new JRadioButton("GREEN");
		JRadioButton blue = new JRadioButton("BLUE");
		
		JPanel panel = new JPanel(new GridLayout(5,1));
		ButtonGroup group = new ButtonGroup();
		group.add(red);
		group.add(green);
		group.add(blue);
		
		red.setLocation(10,30);
		panel.add(red);
		green.setLocation(30,30);
		panel.add(green);
		blue.setLocation(50,30);
		panel.add(blue);
		button.setLocation(80,30);
		panel.add(button);
		panel.add(component);
		frame.add(panel);
		
		
		class selectColor implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				if(red.isSelected())
				{
					component.setColor(Color.RED);
				}
					
				else if(green.isSelected())
				{
					component.setColor(Color.GREEN);
				}
					
				else if(blue.isSelected())
				{
					component.setColor(Color.BLUE);
				}
				
				component.repaint();
			}
		}
		
		
		ActionListener listener = new selectColor();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}

}

class DrawRectangle extends JComponent{
	private Rectangle rec;
	private Color color;
	public DrawRectangle(Color color)
	{
		this.color = color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i=0;i<5;++i){
		// draw a line in integer coordinates
			g2d.fillRect(0, 0, 200, 200);
			g2d.setColor(this.color);
		}
	}
}

