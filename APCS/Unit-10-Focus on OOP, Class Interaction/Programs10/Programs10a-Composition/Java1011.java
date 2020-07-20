// Java1011.java
// The <Leaves> class simulates tree leaves.
// At this stage the leaves are only round.


import java.awt.*;
import java.applet.*;


public class Java1011 extends Applet
{
	public void paint(Graphics g)
	{
      Leaves leaves1 = new Leaves();
      leaves1.drawLeaves(g);

      Point start = new Point(400,100);
      Leaves leaves2 = new Leaves(start,300,300,Color.green);
      leaves2.drawLeaves(g);
	}
}


class Leaves
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

   public void drawLeaves(Graphics g)
   {
      g.setColor(leavesColor);
      g.fillOval(leavesStart.getX(),leavesStart.getY(),leavesWidth,leavesHeight);
   }
}


