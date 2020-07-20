// Tree.java
// This is the completed <TreeB> class kept in its own file.
// The class is now ready to be used by classes external to this file.
// This <TreeB> class will be the superclass for later programs.


import java.awt.*;


public class Tree
{
   private Point treeStart;      // Top-mid (X,Y) coordinates of the tree
   private Point leavesStart;    // Top-left (X,Y) coordinates of the leaves
   private Point trunkStart;     // Top-left (X,Y) coordinates of the trunk
   private int treeHeight;
   private int treeWidth;
   private Color trunkColor;
   private Color leavesColor;
      
   private int leavesHeight;
   private int leavesWidth;
   private int trunkHeight;
   private int trunkWidth;
  
  
   public Tree()
   {
      treeStart = new Point(400,100);
      treeHeight = 500;
      treeWidth = 300;
      trunkColor = Color.black;
      leavesColor = Color.black;
      
      leavesHeight = treeWidth;
      leavesWidth = treeWidth;;
      trunkHeight = treeHeight - leavesHeight;
      trunkWidth = trunkHeight/4;    
      leavesStart = new Point(treeStart.getX()-(leavesWidth/2),treeStart.getY());
      trunkStart = new Point(treeStart.getX()-(trunkWidth/2),treeStart.getY()+leavesHeight-3);
   }   
      
      
   public TreeB(Point tS, int tH, int tW, Color tC, Color lC)
   {
      treeStart = tS;
      treeHeight = tH;
      treeWidth = tW;
      trunkColor = tC;
      leavesColor = lC;
      
      leavesHeight = treeWidth;
      leavesWidth = treeWidth;;
      trunkHeight = treeHeight - leavesHeight;
      trunkWidth = trunkHeight/4;    
      leavesStart = new Point(treeStart.getX()-(leavesWidth/2),treeStart.getY());
      trunkStart = new Point(treeStart.getX()-(trunkWidth/2),treeStart.getY()+leavesHeight-3);
   } 
   
   
   public Point getTreeStart()   { return treeStart;   }
   public Point getLeavesStart() { return leavesStart; }
   public Point getTrunkStart()  { return trunkStart;  }
   public int getTreeHeight()    { return treeHeight;  }
   public int getTreeWidth()     { return treeWidth;   }
   public Color getTrunkColor()  { return trunkColor;  }
   public Color getLeavesColor() { return leavesColor; }
   public int getLeavesHeight()  { return leavesHeight;}
   public int getLeavesWidth()   { return leavesWidth; }
   public int getTrunkHeight()   { return trunkHeight; }
   public int getTrunkWidth()    { return trunkWidth;  }
   
   public void setTreeStart(Point tP)   { treeStart = tP;   }
   public void setLeavesStart(Point lP) { leavesStart = lP; }
   public void setTrunkStart(Point tP)  { trunkStart = tP;  }
   public void setTreeHeight(int tH)    { treeHeight = tH;  }
   public void setTreeWidth(int tW)     { treeWidth = tW;   }
   public void setTrunkColor(Color tC)  { trunkColor = tC;  }
   public void setLeavesColor(Color lC) { leavesColor = lC; }
   public void setLeavesHeight(int lH)  { leavesHeight = lH;}
   public void setLeavesWidth(int lW)   { leavesWidth = lW; }
   public void setTrunkHeight(int tH)   { trunkHeight = tH; }
   public void setTrunkWidth(int tW)    { trunkWidth = tW;  }

         
   public void drawLeaves(Graphics g)
   {
      g.setColor(leavesColor);
      g.fillOval(leavesStart.getX(),leavesStart.getY(),leavesWidth,leavesHeight);
   }
      
   public void drawTrunk(Graphics g)
   {
      g.setColor(trunkColor);
      g.fillRect(trunkStart.getX(),trunkStart.getY(),trunkWidth,trunkHeight);
   }

   public void drawTree(Graphics g)
   {
      drawLeaves(g);
      drawTrunk(g);
   }
      
}   

