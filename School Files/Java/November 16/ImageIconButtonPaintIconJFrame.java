// Paint directly onto JFrame/JApplet surface
// by using "paint()" and "repaint()"
// In general, you NEVER call "paint()" directly.
// Instead, you call "repaint()" , which calls 
// "update()" (which clears the screen) , and update() in turn 
// calls "paint()" (which will display a new image on the JFrame/JApplet)

/*
  Note: created bearImg2 to reference bear2.gif.
  
  When testing , it may not like painting 
  the same image already used on JButton, to display
   on JFrame/JApplet surface. If this is the case, then
	paint bearImg2 instead (which references bear2.gif)
	
	This problem may not occur for "ImageIconButtonPaintIconLabel.java" example
  
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ImageIconButtonPaintIconJFrame extends JFrame implements ActionListener
{
	
	ImageIcon image1;
	ImageIcon image2;
	ImageIcon image2Big;

	ImageIcon imgIcon;

	Image bearImg, jla1Img, jla1BigImg, img, bearImg2; 

	JLabel lImg;	

	JButton bbear, bjla1;

	Container con = getContentPane();
	
	JPanel p1;

	public void init()
	{
		con.setLayout(new FlowLayout());
	   
		
      // for display on JFrame
      bearImg = (new ImageIcon("bear.gif")).getImage();
		bearImg2 = (new ImageIcon("bear2.gif")).getImage();
	   jla1Img = (new ImageIcon("jla1Small.gif")).getImage();
		jla1BigImg = (new ImageIcon("jla1.gif")).getImage();

	   // for JButton
		image1 = new ImageIcon("bear.gif");
		image2 = new ImageIcon("jla1Small.gif");
		image2Big = new ImageIcon("jla1.gif");
		
	   bbear = new JButton(image1);
		bbear.addActionListener(this);
		con.add(bbear);

   bjla1 = new JButton(image2);
	bjla1.addActionListener(this);
	con.add(bjla1);
		
	}


	public void actionPerformed(ActionEvent e)
	{
    // decide which image to "paint"  
	  if (e.getSource() == bbear)
     {
        img = bearImg;
        repaint();
     }
     else
     {
        img = jla1BigImg;
        repaint();   //calls update() to clear screen
                     //and then calls paint()
                     //You never call paint() directly.	  
	  }	
	}
	
	public void paint(Graphics g)
	{
	// try running this applet without the
	// "super.paint(g);"
	  super.paint(g);
     g.drawImage(img,100,100,this);
	 

//////////////////////////////////
/* 
   in case the image covers your buttons, you need to repaint
	them back on
*/	
   bbear.repaint();
   bjla1.repaint();	
	
		
	}
public static void main(String args[])
	{
		ImageIconButtonPaintIconJFrame jm = new ImageIconButtonPaintIconJFrame();
      jm.init();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}


}








