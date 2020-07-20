// Java1020.java
// The <XmasTree> class extends the <PineTree> class
// and newly-defines the <drawOrnaments> method.


import java.awt.*;
import java.applet.*;


public class Java1020 extends Applet
{
	public void paint(Graphics g)
	{
      XmasTree tree4 = new XmasTree();
      tree4.drawTree(g);
      tree4.drawOrnaments(g);
   }
}


class XmasTree extends PineTree
{
   private int topX;
   private int topY;

   public XmasTree()
   {
      topX = getLeavesStart().getX() + getLeavesWidth()/2;
      topY = getLeavesStart().getY();
   }

   public void drawOrnaments(Graphics g)
   {
      g.setColor(Color.red);
      g.fillOval(topX,topY+75,30,30);
      g.fillOval(topX-15,topY-15,30,30);
      g.fillOval(topX,topY+200,30,30);
      g.fillOval(topX-50,topY+150,30,30);
      g.fillOval(topX+50,topY+250,30,30);
      g.fillOval(topX-100,topY+250,30,30);
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


