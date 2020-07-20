// Java1403.java
// This program draws four different squares with the
// same <drawSquare> method name.
// Each method has a different parameter signature.
// These are overloaded methods.


import java.awt.*;
import java.applet.*;


public class Java1403 extends Applet
{
	public void paint(Graphics g)
	{
		drawSquare(g);
		drawSquare(g,200,300);
		drawSquare(g,Color.blue,600,200);
		drawSquare(g,Color.green,500,400,200);
	}

	public void drawSquare(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(100,100,150,150);
	}

	public void drawSquare(Graphics g, int x, int y)
	{
		g.setColor(Color.red);
		g.fillRect(x,y,150,150);
	}

	public void drawSquare(Graphics g, Color color, int x, int y)
	{
		g.setColor(color);
		g.fillRect(x,y,150,150);
	}

	public void drawSquare(Graphics g, Color color, int x, int y, int side)
	{
		g.setColor(color);
		g.fillRect(x,y,side,side);
	}
}

