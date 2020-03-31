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
     private int width;
     private int height;
     
	public RobotBackground(String filename,int x,int y) {
		// TODO Auto-generated constructor stub
		imageicon = new ImageIcon(filename);
		image = imageicon.getImage();
		width = x;
		height = y;
		
	}
	
	public void paintComponent(Graphics g)
	{
		g2 = (Graphics2D) g;
		g2.drawImage(image,0,40,width,height,this);
		
	}

}
