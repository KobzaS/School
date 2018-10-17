import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class DrawCharShapes extends JFrame
{
    String s = "England will win the World Cup";
    char c[] = {'J','a','v','a','c','h','a','r'};

    public void paint(Graphics g)
    {
        // draw string s at x=100, y=25
        g.drawString(s,100,25);

        // draw chars c, from subscript 2, 3 elements drawn, at x=100,y=25 
        g.drawChars(c,2,3,100,50);

        // draw line from x,y to x,y
        g.drawLine(100,70,230,95);

        /////////The following draws Rectangles///////////////////

        // draw Rectangle at x,y with width, height
        g.drawRect(100,90,100,50);

        //draw a solid rectangle with current colour, at x,y with width, height
        g.fillRect(400,90,100,50);

        // draw a rounded rectangle at x,y with width, height, arcWidth,arcHeight
        g.drawRoundRect(100,200,100,50,10,20);

        //draw a solid rectangle with current colour, at x,y with width, height,arcWidth,arcHeight
        g.fillRoundRect(400,200,100,50,10,20);

        //draw 3D rectangle at x,y,w,h,boolean (true - raised)
        //                                     (false - lowered)       
        g.setColor(Color.yellow); // for effect
        // draw rectangle with raised corners
        g.draw3DRect(100,400,100,50,true);

        // same method but with lowered corners
        g.draw3DRect(400,400,100,50,false);

        // You try it with fill3DRect() which has the same parameters
        // draw3DRect

        //reset back to black
        g.setColor(Color.black);

        /////////The following draws ovals///////////////////
        // draw an oval at x,y with width and height
        g.drawOval(100,500,100,70);

        // You try it with fillOval() which has the same parameters
        // drawOval()
        
        /////////The following draws arcs///////////////////
        // draw an arc at x,y, with arc width, arc height,
        //                     starting at angle
        //                     sweeping across angle
        g.drawArc(100,600,80,80,20,-110);

        // You try it with fillArc which has the same parameters
        // as drawArc

       }
       
       public static void main(String args[])
	{
		DrawCharShapes jm = new DrawCharShapes();
      
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}
}

