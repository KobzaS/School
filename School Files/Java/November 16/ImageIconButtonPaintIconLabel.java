// Demo of using "setIcon(ImageIcon)" to "paint"
// ImageIcon images onto component surfaces
// This one uses a JLabel as a surface

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ImageIconButtonPaintIconLabel extends JFrame implements ActionListener
{
	
	ImageIcon image1; 
	ImageIcon image2;
	ImageIcon image3; 

	Image bearImg, jla1Img, jla1BigImg; 

	JButton bbear, bjla1;
	
	JLabel lblImg;

	Container con = getContentPane();
	

	public void init()
	{
		con.setLayout(new FlowLayout());
		
		
		image1 = new ImageIcon("bear.gif");  // next few lines are for the image
		image2 = new ImageIcon("jla1Small.gif"); // on the buttons
														
		image3 = new ImageIcon("jla1.gif"); // For the large image
		
		bbear = new JButton(image1);
		bbear.addActionListener(this);
		con.add(bbear);

	   bjla1 = new JButton(image2);
		bjla1.addActionListener(this);
		con.add(bjla1);
      
		lblImg = new JLabel();
		con.add(lblImg);

	}


   public void actionPerformed(ActionEvent e)
	{
      if (e.getSource() instanceof JButton)
      {
         if (e.getSource() == bbear)
         {
            lblImg.setIcon(image1);
         }
         else
         {
            lblImg.setIcon(image3);
         }
      }
      
	    
		      // displays ImageIcon image
	                            // using JLabel as a surface
		    
	         
	
	}

public static void main(String args[])
	{
		ImageIconButtonPaintIconLabel jm = new ImageIconButtonPaintIconLabel();
      jm.init();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}

	

}








