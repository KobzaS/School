// Demo of loading and displaying gif/jpg images
// using Image class
// Image objects can be displayed in scale, BUT they can only be
// displayed on JApplet or JFrame surfaces (NOT on any components like JButton etc)
// 
// If you're using Paint on a Panel, we use Paint Component.

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class LadyBugImage extends JFrame
{
   ImageIcon bug;
   Image bugimg;

   public void init()
   {
      bug = new ImageIcon("jla1.gif"); // If it's in another folder, you have to put the path down
      // converts imageIcon object to Image object.
      bugimg = bug.getImage();
           
      
      
   }

   public void paint(Graphics g)
   {
      //To fully clear the screen
      super.paint(g);
      
      
      // both getWidth() and getHeight() has an ImageObserver as the argument
      int iwidth = bugimg.getWidth(this), iheight = bugimg.getHeight(this); 
     
      int xpos = 10;

		
		      // draw image(image, x,y, width, height, ImageObserver argument) 
      //25%
      g.drawImage(bugimg, xpos, 10, iwidth/4, iheight/4, this);
      //50%
  		g.drawImage(bugimg, xpos, 10, iwidth/2, iheight/2, this);

      //100%
      g.drawImage(bugimg, xpos, 10, iwidth, iheight, this);
      

      //150% for x and 25% for y
      g.drawImage(bugimg, xpos*15/10, 10/4, iwidth, iheight, this);
         

	}
   
public static void main(String args[])
	{
		LadyBugImage jm = new LadyBugImage();
      jm.init();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}


}
