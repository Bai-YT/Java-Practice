// Leaves.java
// This is the completed <Leaves> class kept in its own file.
// This class is now ready to be used by classes external to this file.


import java.awt.*;


public class Leaves
{
   private Point leavesStart;
   private int leavesWidth;
   private int leavesHeight;
   private Color leavesColor;
      
   public Leaves()
   {
      leavesStart = new Point(0,0);
      leavesWidth = 200;
      leavesHeight = 200;
      leavesColor = Color.black;
   }
      
   public Leaves(Point lS, int lW, int lH, Color lC)
   {
      leavesStart = lS;
      leavesWidth = lW;
      leavesHeight = lH;
      leavesColor = lC;
   }
      
   public Point getLeavesStart()  { return leavesStart;  }
   public int getLeavesHeight()   { return leavesHeight; }
   public int getLeavesWidth()    { return leavesWidth;  }
   public Color getLeavesColor()  { return leavesColor;  }
      
   public void setLeavesStart(Point lP)  { leavesStart = lP;  }
   public void setLeavesHeight(int lH)   { leavesHeight = lH; }
   public void setLeavesWidth(int lW)    { leavesWidth = lW;  }
   public void setLeavesColor(Color lC)  { leavesColor = lC;  }
           
   public void drawLeaves(Graphics g)
   {
      g.setColor(leavesColor);
      g.fillOval(leavesStart.getX(),leavesStart.getY(),leavesWidth,leavesHeight);
   }
}   


