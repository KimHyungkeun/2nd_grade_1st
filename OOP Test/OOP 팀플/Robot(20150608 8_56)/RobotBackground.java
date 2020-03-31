package Assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class RobotBackground extends JComponent{
	 private Image image;
	 private ImageIcon imageicon;
     private Graphics2D g2;
     private int framewidth;
     private int frameheight;
     
	public RobotBackground(String filename,int x,int y) {
		// TODO Auto-generated constructor stub
		imageicon = new ImageIcon(filename);
		image = imageicon.getImage();
		framewidth = x;
		frameheight = y;
		
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(image,0,0,framewidth,frameheight,this);
		g2 = (Graphics2D) g;
		
		
	}

}
