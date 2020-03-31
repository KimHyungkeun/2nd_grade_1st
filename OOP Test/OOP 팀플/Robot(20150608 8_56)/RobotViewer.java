package Assignment;
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
	 private JPanel totalpanel = new JPanel(); //totalpanel
	 private JPanel framepanel = new JPanel(); //framepanel
	 private LayoutManager overlay;
     private RobotBackground background = new RobotBackground("SpongeBob.jpg",FRAME_WIDTH,FRAME_HEIGHT);
     private JLabel backgroundlabel = new JLabel(); //label about save background
     
     private JPanel Choice = new JPanel(); //button choice
     private JButton button_start =new JButton("Start Dancing");
     private JButton button_create1 = new JButton("Create Robot1");
     private JButton button_create2 = new JButton("Create Robot2");
     private JButton button_stop = new JButton("Stop Dancing");
     
  
     final int DELAY = 10; // Milliseconds between timer ticks
 	 final int DELAY2 = 50;
 	 
 	private FirstThread thread;
	private FirstThread thread2;
	private MymotionListener mymouselistener;
	private MymotionListener2 mymouselistener2;
	
	private int clickcount1 = 0; //counting createrobot 1
	private int clickcount2 = 0; //counting  createrobot 2
	
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
    	 
    	 overlay = new OverlayLayout(totalpanel);
    	 totalpanel.setLayout(overlay);
    	
    	 
    	//add(background,BorderLayout.CENTER);
		//image.setLayout(new OverlayLayout(Choice));
		Choice.setLayout(new GridLayout(1,4));
	    Choice.add(button_start);
		Choice.add(button_create1);
		Choice.add(button_create2);
		Choice.add(button_stop);
		
		
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
		
		backgroundlabel.add(background);
		totalpanel.add(backgroundlabel);
		add(Choice,BorderLayout.NORTH);
		add(totalpanel, BorderLayout.CENTER);
		
		
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
 		clickcount1++;
 		thread = new FirstThread(clickcount1,DELAY, true);
 	    totalpanel.add(thread.getRobot());
 		thread.getRobot().addMouseMotionListener(mymouselistener);
 		thread.start();
		
 	}
 	
 	
 	public void createrobot2()
 	{
 		clickcount2++;
 		thread2 = new FirstThread(clickcount2,DELAY2, false);
 		totalpanel.add(thread2.getRobot());
		thread2.getRobot().addMouseMotionListener(mymouselistener2);
		thread2.start();
 	}
 	
	


	

}
