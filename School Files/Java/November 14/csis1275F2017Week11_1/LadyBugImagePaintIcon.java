// Demo of loading and displaying gif/jpg images
// using ImageIcon 
/*
   Image can only display on JFrame/JApplet surfaces.
   
   ImageIcon can display on JFrame/JApplet as well as components like
   JPanel,JLabel, JButton etc..
*/     
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class LadyBugImagePaintIcon extends JFrame
{
   ImageIcon bugimg;
	Image img;

   public void init()
   {
      // getImage(getCodeBase() which detemines the location of the Applet file
      //          actual location of gif or jpeg image.  
     	/*
      Note, ImageIcon() does not recieve an URL as a parameter
      so, to make use of getCodeBase/getDocumentBase,
      use getImage() to capture the picture as an Image object
      and pass it as a parameter to ImageIcon
      
       */  
           
		 bugimg = new ImageIcon("jla1.gif");
   }

   public void paint(Graphics g)
   {
     
	    super.paint(g);
	  
	/////////////////////////  
	/* paintIcon(Component, GraphicsObject, x-coord, y-coord)
	
	   where:
		 Component: object on which image is displayed 
	    GraphicsObject: The graphics object used  to render the image
		 x-coord: x-coordinate of upper left corner
		 y-coord: y-coordinate of upper left corner
	
	    COMPARE this with the "drawImage()" method
		 For ImageIcon, you cannot display in scale 
		 
	*/
		 //bugimg.paintIcon(this,g,0,0); Can't control the size of it. Unlike Image.
       
   ///////////////////////////////////////////////////////////////
   // To display ImageIcon objects in scale, you can use "drawImage"
   // Notice in "drawImage", you use  "bugimg.getImage()", rather thsn just
   // "bugimg", because ImageIcon objects cannot be drawn to scale, BUT Image
   // can, so "bugimg.getImage()" returns a scalable image reference
   
   //
   //Please COMMENT OUT ABOVE "paintIcon" LINE BEFORE uncommenting the lines below
   
       int iwidth = bugimg.getIconWidth();
		int iheight = bugimg.getIconHeight();
      
      int xpos = 10;
		      // draw image(image, x,y, width, height, ImageObserver argument) 
        g.drawImage(bugimg.getImage(),xpos,10,iwidth/2,iheight/2,this);
     
     
     // For class, now uncomment both "paintIcon" and "drawImage" and
     // see what happens.   

	}
public static void main(String args[])
	{
		LadyBugImagePaintIcon jm = new LadyBugImagePaintIcon();
      jm.init();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}


}
