// demo of placing images into
// Components like JButtons etc...

/*
 		
		"ImageIcon image1 = new ImageIcon("bear.gif");"
    	"ImageIcon image2 = new ImageIcon("jla1Small.gif");" 
		
		

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ImageIconButton extends JFrame 
{
	
	ImageIcon image1 = new ImageIcon("bear.gif");
	ImageIcon image2 = new ImageIcon("jla1Small.gif");

	Image bearImg, jla1Img; 

	JButton bbear, bjla1;

	Container con = getContentPane();
	

	public void init()
	{
		con.setLayout(new FlowLayout());
			
		// Using the JButton(Icon) constructor
      bbear = new JButton(image1);
		// Note: ImageIcon is a subclass of Icon
		bjla1 = new JButton (image2);
      
      con.add(bbear);
      con.add(bjla1);	

	}

   public static void main(String args[])
	{
		ImageIconButton jm = new ImageIconButton();
      jm.init();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}


}








