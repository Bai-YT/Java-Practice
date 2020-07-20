// Java1014.java
// The <Tree> class uses the three stand-alone classes:
// <Point>, <Trunk> and <Leaves> to draw a tree.
// This <Tree> class "has" three attributes that are objects
// using a composition class-interaction.


import java.awt.*;
import java.applet.*;


public class Java1014 extends Applet
{
	public void paint(Graphics g)
	{
      Point treeStart = new Point(500,100);
      int treeHeight = 500;
      int treeWidth = 300;
      Color trunkColor = new Color(150,100,15);  // brown
      Color leavesColor = Color.green;
      Tree tree = new Tree(treeStart, treeHeight, treeWidth, trunkColor, leavesColor);
      tree.drawTree(g);
	}
}


class Tree
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
   private Trunk trunk;          // A tree "has-a" trunk
   private Leaves leaves;        // A tree "has-a" leaves


   public Tree(Point tS, int tH, int tW, Color tC, Color lC)
   {
      treeStart = tS;
      treeHeight = tH;
      treeWidth = tW;
      trunkColor = tC;
      leavesColor = lC;

      leavesHeight = treeWidth;
      leavesWidth = treeWidth;
      trunkHeight = treeHeight - leavesHeight;
      trunkWidth = trunkHeight/4;
      trunkStart = new Point(treeStart.getX()-(trunkWidth/2),treeStart.getY()+leavesHeight-3);
      leavesStart = new Point(treeStart.getX()-(leavesWidth/2),treeStart.getY());

      trunk = new Trunk(trunkStart,trunkWidth,trunkHeight,trunkColor);
      leaves = new Leaves(leavesStart,leavesWidth,leavesHeight,leavesColor);
   }

   public void drawTree(Graphics g)
   {
      trunk.drawTrunk(g);
      leaves.drawLeaves(g);
   }

}

