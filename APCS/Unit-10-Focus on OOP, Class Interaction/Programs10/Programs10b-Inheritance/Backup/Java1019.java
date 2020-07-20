// Java1019.java
// The <PineTree> class extends the <Tree> class
// and re-defines the <drawLeaves> method.


import java.awt.*;
import java.applet.*;


public class Java1019 extends Applet
{
	public void paint(Graphics g)
	{
      PineTree tree3 = new PineTree();
      tree3.drawTree(g);
    }
}


class PineTree extends Tree
{
   public PineTree()
   {
      setLeavesColor(Color.green);
   }

   public void drawLeaves(Graphics g)
   {
      g.setColor(getLeavesColor());
      int tempX = getLeavesStart().getX();
      int tempY = getLeavesStart().getY();
      int topX = tempX + getLeavesWidth()/2;
      int topY = tempY;
      int blX = tempX;
      int blY = tempY + getLeavesHeight();
      int brX = tempX + getLeavesWidth();
      int brY = tempY + getLeavesHeight();
      Polygon triangle = new Polygon();
      triangle.addPoint(topX,topY);
      triangle.addPoint(blX,blY);
      triangle.addPoint(brX,brY);
      g.fillPolygon(triangle);
   }
}

