// Java1008.java
// This <Trunk> class uses "has-a" composition.
// In this example, a <Point> object is constructed
// outside the <Trunk> class and passed as parameter
// to construct a <Trunk> object.


import java.awt.*;
import java.applet.*;


public class Java1008 extends Applet
{
	public void paint(Graphics g)
	{
      Trunk trunk1 = new Trunk();
      trunk1.drawTrunk(g);

      Point point2 = new Point(350,400);
      Trunk trunk2 = new Trunk(point2,75,300,Color.orange);
      trunk2.drawTrunk(g);
	}
}


class Trunk
{
   private Point trunkStart;
   private int trunkHeight, trunkWidth;
   private Color trunkColor;

   public Trunk()
   {
      trunkStart = new Point(0,0);
      trunkHeight = 320;
      trunkWidth = trunkHeight/4;
      trunkColor = Color.black;
   }

   public Trunk(Point tS,int tW, int tH, Color tC)
   {
      trunkStart = tS;
      trunkHeight = tH;
      trunkWidth = tW;
      trunkColor = tC;
   }

   public void drawTrunk(Graphics g)
   {
      g.setColor(trunkColor);
      g.fillRect(trunkStart.getX(),trunkStart.getY(),trunkWidth,trunkHeight);
   }
}



