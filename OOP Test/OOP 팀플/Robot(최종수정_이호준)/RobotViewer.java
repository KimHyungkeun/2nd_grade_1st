package Assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import javazoom.jl.player.Player;

public class RobotViewer extends JFrame{
	private static final int FRAME_WIDTH = 800; // Width of frame
	private static final int FRAME_HEIGHT = 800; // Height of frame
	private LayoutManager overlay;
	private JPanel totalpanel = new JPanel();
	private RobotBackground background = new RobotBackground("SpongeBob.jpg",FRAME_WIDTH, FRAME_HEIGHT-100);
													// background
	SoundThread player;
	boolean isPlayerStarted;
	
	private JPanel choice = new JPanel(); // button choice
	private JButton button_start = new JButton("Start Dancing");
	private JButton button_create1 = new JButton("Create Robot1");
	private JButton button_create2 = new JButton("Create Robot2");
	private JButton button_stop = new JButton("Stop Dancing");

	private RobotParts twoRobots = new RobotParts(50,100);
	
	
	private MymotionListener mymouselistener;


	class MymotionListener implements MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent arg0) {
			if (twoRobots.isHitIt(arg0))
			{
				twoRobots.setPoints(arg0.getX()-50,arg0.getY()-50);
			}
			else
			if(twoRobots.isHitIt2(arg0))
			{
				twoRobots.setPoints2(arg0.getX()-50,arg0.getY()-50);
			}
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

	}


	public RobotViewer() throws FileNotFoundException {
		
		isPlayerStarted = false;

		overlay = new OverlayLayout(totalpanel);
		totalpanel.setLayout(overlay);

		choice.setLayout(new GridLayout(1, 4));
		choice.add(button_start);
		choice.add(button_create1);
		choice.add(button_create2);
		choice.add(button_stop);

		ActionListener listener1 = new ClickListener1();
		button_start.addActionListener(listener1);

		ActionListener listener2 = new ClickListener2();
		button_create1.addActionListener(listener2);

		ActionListener listener3 = new ClickListener3();
		button_create2.addActionListener(listener3);

		ActionListener listener4 = new ClickListener4();
		button_stop.addActionListener(listener4);

		ActionListener listener5 = new ClickListener5();

		ActionListener listener6 = new ClickListener6();

		ActionListener listener7 = new ClickListener7();

		player = new SoundThread();
		player.setPath("Eviction.mp3");
		
		JRadioButton musicstart = new JRadioButton();
		JRadioButton musicstop = new JRadioButton();
		JRadioButton musicresume = new JRadioButton();
		JLabel musicStart = new JLabel("¿Ωæ« Ω√¿€");
		JLabel musicStop = new JLabel("¿Ωæ« ∏ÿ√„");
		JLabel musicResume = new JLabel("¿Ωæ« ¿Á∞≥");
		JPanel musicStartBag = new JPanel();
		JPanel musicStopBag = new JPanel();
		JPanel musicResumeBag = new JPanel();
		
		musicStartBag.add(musicstart);
		musicStartBag.add(musicStart);
		musicResumeBag.add(musicresume);
		musicResumeBag.add(musicResume);
		musicStopBag.add(musicstop);
		musicStopBag.add(musicStop);
		ButtonGroup group = new ButtonGroup();
		group.add(musicstart);
		group.add(musicstop);
		group.add(musicresume);
		JPanel radiogroup = new JPanel();
		radiogroup.setLayout(new GridLayout(1, 3));
		musicstart.addActionListener(listener5);
		musicstop.addActionListener(listener6);
		musicresume.addActionListener(listener7);
		radiogroup.add(musicStartBag);
		radiogroup.add(musicStopBag);
		radiogroup.add(musicResumeBag);
		add(radiogroup, BorderLayout.SOUTH);
		add(choice, BorderLayout.NORTH);
		
		
		mymouselistener = new MymotionListener();
		/*mymouselistener2 = new MymotionListener2();

		thread.getRobot().addMouseMotionListener(mymouselistener);
		thread2.getRobot().addMouseMotionListener(mymouselistener2);*/

		/*twoRobotPanel = new JLabel();
		aRobot = new JPanel();
		anotherRobot = new JPanel();
		twoRobotPanel.setLayout(null);
		aRobot.add(thread.getRobot());
		anotherRobot.add(thread2.getRobot());
		twoRobotPanel.add(aRobot);
		twoRobotPanel.add(anotherRobot);*/
		//totalpanel.add(thread.getRobot());
		twoRobots.addMouseMotionListener(mymouselistener);
		totalpanel.add(twoRobots);
		totalpanel.add(background);

		add(totalpanel, BorderLayout.CENTER);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	class ClickListener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			startdancing();
			System.out.println("Dance Start!!");
		}
	}

	class ClickListener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createrobot();
			System.out.println("Create Robot1");
		}
	}

	class ClickListener3 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createrobot2();
			System.out.println("Create Robot2");
		}
	}

	class ClickListener4 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			stopdancing();
			System.out.println("Dance Stop!!");
		}
	}

	class ClickListener5 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (!isPlayerStarted) {
				player.play(-1);
				isPlayerStarted = true;
			}
		}
	}

	class ClickListener6 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
				player.pause();
				isPlayerStarted = false;
		}
	}

	class ClickListener7 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			player.resume();
			isPlayerStarted = true;
		}
	}

	public void startdancing() {
		twoRobots.startdancing();
	}

	public void stopdancing() {
		twoRobots.stopdancing();
	}

	public void createrobot() {
		twoRobots.letVisible();
	}

	public void createrobot2() {
		twoRobots.letVisible2();
	}

}
