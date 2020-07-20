// Java1007.java
// The <Trunk> class now uses a overloaded constructor that
// allows construction with the trunk's location, height and color.


import java.awt.*;
import java.applet.*;


public class Java1007 extends Applet
{
	public void paint(Graphics g)
	{
      Trunk trunk1 = new Trunk();
      Trunk trunk2 = new Trunk(350,400,75,300,Color.orange);
      trunk1.drawTrunk(g);
      trunk2.drawTrunk(g);
	}
}


class Trunk
{
   private int trunkStartX, trunkStartY;
   private int trunkHeight, trunkWidth;
   private Color trunkColor;

   public Trunk()
   {
      trunkStartX = 0;
      trunkStartY = 0;
      trunkHeight = 320;
      trunkWidth = 80;
      trunkColor = Color.black;
   }
   
   public Trunk(int tX, int tY, int tW, int tH, Color tC)
   {
      trunkStartX = tX;
      trunkStartY = tY;
      trunkHeight = tH;
      trunkWidth = tW;
      trunkColor = tC;
   }

   public void drawTrunk(Graphics g)
   {
      g.setColor(trunkColor);
      g.fillRect(trunkStartX,trunkStartY,trunkWidth,trunkHeight);
   }  
}

