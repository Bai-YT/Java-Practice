// Java1015.java
// This second version of a tree class does not use
// attributes that are <Trunk> and <Leaves> objects.
// The <Tree> class also adds a default constructor.


import java.awt.*;
import java.applet.*;


public class Java1015 extends Applet
{
	public void paint(Graphics g)
	{
      Tree tree1 = new Tree();
      tree1.drawTree(g);

      Point treeStart = new Point(700,50);
      Tree tree2 = new Tree(treeStart,400,200,Color.blue,Color.red);
      tree2.drawTree(g);
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


   public Tree(Point tS, int tH, int tW, Color tC, Color lC)
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
      drawTrunk(g);
      drawLeaves(g);
   }

}

