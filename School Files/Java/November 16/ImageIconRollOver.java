// Demo of using mouse to change image
//on a  JLabel as a surface.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ImageIconRollOver extends JFrame implements MouseListener
{
	
	ImageIcon image1; 
	ImageIcon image2;
	ImageIcon image3; 

		
	JLabel lblImg;
   JPanel p1;

	Container con = getContentPane();
	

	public void init()
	{
		con.setLayout(new FlowLayout());
		
		
		image1 = new ImageIcon("jla1.gif");  
		image2 = new ImageIcon("jla1Small.gif"); 
														
		p1 = new JPanel();
      p1.setLayout(new GridLayout(1,1));
      
			      
		lblImg = new JLabel();
      lblImg.addMouseListener(this);
      
      // set mouse listener to p1 - could also set to lblImg
      
		p1.add(lblImg);
      lblImg.setIcon(image2);
      con.add(p1);

	}


   public void mouseClicked(MouseEvent e)
   {
   }
   
   public void mouseEntered(MouseEvent e)
   {
      lblImg.setIcon(image1);
      lblImg.repaint();           
   }
   
   public void mouseExited(MouseEvent e)
   {
      lblImg.setIcon(image2);      
      lblImg.repaint();        
   }
   
   public void mousePressed(MouseEvent e)
   {
   }
   
   public void mouseReleased(MouseEvent e)
   {
   }	


public static void main(String args[])
	{
		ImageIconRollOver jm = new ImageIconRollOver();
      jm.init();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}

	

}








