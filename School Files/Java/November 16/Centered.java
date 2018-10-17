// demo of "centering" a string in the middle of an JFRame/applet
import java.awt.*;
import javax.swing.*;

public class Centered extends JFrame
{

      Container con = getContentPane();
		
		public void init()
		{
		 con.setBackground(Color.yellow);		
		}
		

      public void paint(Graphics g)
      {
           super.paint(g); 
           int width, height;     
			  
		  
			  Font f = new Font("TimesRoman", Font.PLAIN, 25);
           
           String s = "This is how the world ends";
			  
			  FontMetrics fm = getFontMetrics(f);
			  			  
			  g.setFont(f);
			 // Calculate the mid point
            int x = (getWidth() - fm.stringWidth(s))/2;
            int y = (getHeight() - fm.getHeight())/2;
			  
						  
			  g.drawString(s,x,y);
			  

      }
      
      public static void main(String args[])
	{
		Centered jm = new Centered();
      
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}

}
