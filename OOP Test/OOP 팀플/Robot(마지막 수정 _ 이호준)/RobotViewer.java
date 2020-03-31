import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class RobotViewer extends JFrame implements dancingrobots
{
	 private static final int FRAME_WIDTH = 800; //Width of frame
	 private static final int FRAME_HEIGHT = 500; //Height of frame
     private JPanel Choice = new JPanel(); //button choice
     private Container image = new Container();
     private JButton button_start =new JButton("Start Dancing");
     private JButton button_create1 = new JButton("Create Robot1");
     private JButton button_create2 = new JButton("Create Robot2");
     private JButton button_stop = new JButton("Stop Dancing");

     final int DELAY = 10; // Milliseconds between timer ticks
 	 final int DELAY2 = 50;
 	 
 	FirstThread thread;
	FirstThread thread2;
	MymotionListener mymouselistener;
	MymotionListener2 mymouselistener2;
	
	 class MymotionListener implements MouseMotionListener{
			@Override
			public void mouseDragged(MouseEvent arg0) {
				if(thread.getRobot().isHitIt(arg0))
					thread.getRobot().setPoints(arg0.getX()-20,arg0.getY()-20,true);
			}
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub	
			}
			
		}
		class MymotionListener2 implements MouseMotionListener{
			@Override
			public void mouseDragged(MouseEvent arg0) {
				if(thread2.getRobot().isHitIt(arg0))
					thread2.getRobot().setPoints(arg0.getX()-10,arg0.getY()-10,false);
			}
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub	
			}
		}
    
     public RobotViewer() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		add(image,BorderLayout.CENTER);
		image.setLayout(new OverlayLayout(Choice));
		Choice.setLayout(new FlowLayout());
	    Choice.add(button_start);
		Choice.add(button_create1);
		Choice.add(button_create2);
		Choice.add(button_stop);
		//Choice.add(button_eat);
		
		ActionListener listener1 = new ClickListener1();
		button_start.addActionListener(listener1);
		
		ActionListener listener2 = new ClickListener2();
		button_create1.addActionListener(listener2);
		
		ActionListener listener3 = new ClickListener3();
		button_create2.addActionListener(listener3);
		
		ActionListener listener4 = new ClickListener4();
		button_stop.addActionListener(listener4);
		
		/*createrobot();
		createrobot2();
		startdancing();
		//stopdancing();
*/			
		mymouselistener = new MymotionListener();
		//baby = new DanceBaby();
		mymouselistener2 = new MymotionListener2();
		//getContentPane().add(Robot);
		getContentPane().add(Choice);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

     class ClickListener1 implements ActionListener
     {	
    	 public void actionPerformed(ActionEvent event)
    		{
    		    startdancing();
    			System.out.println("Dance Start!!");
    		}
     }
     class ClickListener2 implements ActionListener
     {	
    	public void actionPerformed(ActionEvent event)
    		{
    			createrobot();
    			System.out.println("Create Robot1");
    		}
     }
    class ClickListener3 implements ActionListener
     {	
    	public void actionPerformed(ActionEvent event)
    		{
    			createrobot2();
    			System.out.println("Create Robot2");
    		}
     }
     class ClickListener4 implements ActionListener
     {	
    	public void actionPerformed(ActionEvent event)
    		{
    		    stopdancing();
    			System.out.println("Dance Stop!!");
    		}
     }
     public void startdancing() {
 		// TODO Auto-generated method stub
 		thread.startit();
 		thread2.startit();
 	}
 	@Override
 	public void stopdancing() {
 		// TODO Auto-generated method stub
 		thread.stopit();
 		thread2.stopit();
 	}
 	
 	public void createrobot()
 	{
 		thread = new FirstThread(DELAY, true);
 		add(thread.getRobot());
 		thread.getRobot().addMouseMotionListener(mymouselistener);
 		thread.start();
		
 	}
 	
 	
 	public void createrobot2()
 	{
 		thread2 = new FirstThread(DELAY2, false);
 		thread2.getRobot();
 		add(thread2.getRobot());
		thread2.getRobot().addMouseMotionListener(mymouselistener2);
		thread2.start();
 	}
 	
	


	

}
