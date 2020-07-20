// Java1010.java
// The <Trunk> class can now join the <Point> class
// as a stand-alone class ready to be used by other classes.


import java.awt.*;
import java.applet.*;


public class Java1010 extends Applet
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



