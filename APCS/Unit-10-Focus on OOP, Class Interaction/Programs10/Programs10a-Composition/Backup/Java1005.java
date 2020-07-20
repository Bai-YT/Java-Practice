// Java1005.java
// The <Point> class is placed in an external "stand-alone" file.
// This follows the general rule of "one class, one file."


import java.awt.*;
import java.applet.*;


public class Java1005 extends Applet
{
	public void paint(Graphics g)
	{
      Point point1 = new Point();
      g.setColor(Color.red);
      g.fillRect(point1.getX(),point1.getY(),400,300);

      Point point2 = new Point(300,200);
      g.setColor(Color.blue);
      g.fillRect(point2.getX(),point2.getY(),450,200);

      point2.setX(100);
      point2.setY(100);
      g.setColor(Color.green);
      g.fillRect(point2.getX(),point2.getY(),500,500);
	}
}

