// Java1009.java
// The <Trunk> class is now complete with four "get" methods and four "set" methods.


import java.awt.*;
import java.applet.*;


public class Java1009 extends Applet
{
	public void paint(Graphics g)
	{
      Trunk trunk1 = new Trunk();
      trunk1.drawTrunk(g);

      Point point2 = new Point(350,400);
      Trunk trunk2 = new Trunk(point2,75,300,Color.red);
      trunk2.drawTrunk(g);
	}
}


class Trunk
{
   private Point trunkStart; 
   private int trunkHeight,trunkWidth;
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

   public Point getTrunkStart()  { return trunkStart;  }
   public int getTrunkHeight()   { return trunkHeight; }
   public int getTrunkWidth()    { return trunkWidth;  }
   public Color getTrunkColor()  { return trunkColor;  }

   public void setTrunkStart(Point tP)  { trunkStart = tP;  }
   public void setTrunkHeight(int tH)   { trunkHeight = tH; }
   public void setTrunkWidth(int tW)    { trunkWidth = tW;  }
   public void setTrunkColor(Color tC)  { trunkColor = tC;  }

   public void drawTrunk(Graphics g)
   {
      g.setColor(trunkColor);
      g.fillRect(trunkStart.getX(),trunkStart.getY(),trunkWidth,trunkHeight);
   }
}



