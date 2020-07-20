// Trunk.java
// This is the completed <Trunk> class kept in its own file.
// This class is now ready to be used by classes external to this file.


import java.awt.*;


public class Trunk
{
   private Point trunkStart;
   private int trunkHeight;
   private int trunkWidth;
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
 


