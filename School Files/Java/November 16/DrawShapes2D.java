// Demo of Java2D
import java.awt.*;
import java.awt.geom.*; // For the 2D methods i.e. Line2D etc...
import java.applet.*;
import javax.swing.*;

public class DrawShapes2D extends JFrame
{
    
    public void paint(Graphics g)
    {
         
		 // To access Java2D, we need to convert the Graphics g object
		//  to a Graphics2D object,accompolished below by casting 
			Graphics2D g2d = (Graphics2D) g;
	 
		//	set the thickness of the line.
		  g2d.setStroke( new BasicStroke(10.0f,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		// can also use below constructor:	 
		//  g2d.setStroke( new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		//											3 pixels wide, how line ends , how line joins together e.g in a rectangle 	
	 
        // draw line from x,y to x,y
        g2d.draw( new Line2D.Double(100,70,230,95));

        /////////The following draws Rectangles///////////////////

        // draw Rectangle at x,y with width, height
        g2d.draw (new Rectangle2D.Double(100,90,100,50));

        // draw a rounded rectangle at x,y with width, height, arcWidth,arcHeight
        g2d.draw( new RoundRectangle2D.Double(100,200,100,50,10,20));

        //draw a solid rectangle with current colour, at x,y with width, height,arcWidth,arcHeight
  			g2d.setPaint(Color.green);      
			g2d.fill(new RoundRectangle2D.Double(400,200,100,50,10,20));

      
        /////////The following draws ovals///////////////////
        // draw an oval at x,y with width and height
        g2d.fill (new Ellipse2D.Double(100,300,100,70));

                
        /////////The following draws arcs///////////////////
        // draw an arc at x,y, with arc width, arc height,
        //                     starting at angle
        //                     sweeping across angle
		  //							 Arc2D.PIE	arc closed by drawing 2 lines
		//								            one from arc's starting point to center of bounding rectangle
		//												one from center of bounding rectangle to ending point
		//								
		  //						or	 Arc2D.CHORD draws line from starting point to ending point.
			//						or  Arc2D.OPEN	 leave arc open		
        g2d.draw( new Arc2D.Double(100,400,80,80,20,-110,Arc2D.CHORD));

        // You try it with g2d.fill which has the same parameters
        
		  // For Polygons
	     GeneralPath pol = new GeneralPath();
		  pol.moveTo(10,193);		// specify first point of the shape
		  pol.lineTo(25,183);		// draw a line to next point 25,183
		  pol.lineTo(100,223);		// draw a line to next point 100,223
		  pol.closePath();			// draw line from last point to point specified in last call to moveTo		
		  g2d.draw(pol);

       }
       
       
       public static void main(String args[])
	{
		DrawShapes2D jm = new DrawShapes2D();
      
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}

       
       
       
}

