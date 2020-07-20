// Java1013.java
// The <Leaves> class joins the <Point> class and <Trunk> class.
// as a stand-alone class ready to be used by other classes.


import java.awt.*;
import java.applet.*;


public class Java1013 extends Applet
{
	public void paint(Graphics g)
	{
      Leaves leaves1 = new Leaves();
      leaves1.drawLeaves(g);

      Point start = new Point(400,100);
      Leaves leaves2 = new Leaves(start,300,300,Color.blue);
      leaves2.drawLeaves(g);
	}
}


