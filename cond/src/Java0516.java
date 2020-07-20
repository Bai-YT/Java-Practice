// Java0516.java
// This program is example of displaying multiple graphics rectangles
// using a loop control structure.


import java.awt.*;
import java.applet.*;


public class Java0516 extends Applet
{
	public void paint(Graphics g)
	{
		int x = 375;
		int y = 275;
		int side = 50;
		for (int k = 1; k <= 25; k++)
		{
			g.drawRect(x,y,side,side);
			x -= 10;
			y -= 10;
			side += 20;
		}
	}
}


