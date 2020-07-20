// Java1003.java
// The <Point> class is now used in a graphics program.


import java.awt.*;
import java.applet.*;


public class Java1003 extends Applet
{
	public void paint(Graphics g)
	{
      Point point1 = new Point();
      g.setColor(Color.red);
      g.fillRect(point1.getX(),point1.getY(),400,300);

      Point point2 = new Point(300,200);
      g.setColor(Color.blue);
      g.fillRect(point2.getX(),point2.getY(),450,200);
	}
}


class Point
{
   private int x,y;

   public Point()
   {
      x = 0;
      y = 0;
   }

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public int getX()
   {
      return x;
   }

   public int getY()
   {
      return y;
   }
}
