// Java0408.java
// This program demonstrates how to draw pixels.
// Pixels are drawn from (X,Y) to (X,Y) with <drawLine(X,Y,X,Y)>.


import java.awt.*;
import java.applet.*;

public class Java0408 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(100,100,100,100);
		g.drawLine(200,100,200,100);
		g.drawLine(100,200,100,200);
		g.drawLine(200,200,200,200);
	}
}
