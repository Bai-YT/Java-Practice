// Java1004.java
// This program adds two set methods to the <Point> class.
// Note how "one-statement" methods are written on one line.


import java.awt.*;
import java.applet.*;


public class Java1004 extends Applet
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


class Point
{
   private int x;
   private int y;

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

   public int getX() { return x; }
   public int getY() { return y; }

   public void setX(int x) { this.x = x; }
   public void setY(int y) { this.y = y; }

}
