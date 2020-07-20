// Java1006.java
// This program introduces the <Trunk> class.
// The program displays a tree trunk using only a default constructor.


import java.awt.*;
import java.applet.*;


public class Java1006 extends Applet
{
	public void paint(Graphics g)
	{
      Trunk trunk = new Trunk();
      trunk.drawTrunk(g);
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

   public void drawTrunk(Graphics g)
   {
      g.setColor(trunkColor);
      g.fillRect(trunkStartX,trunkStartY,trunkWidth,trunkHeight);
   }  
}


