// Java1402.java
// This program draws four squares with four different
// <drawSquare> methods.
// There are no overloaded methods.


import java.awt.*;
import java.applet.*;


public class Java1402 extends Applet
{
	public void paint(Graphics g)
	{
		drawSquare1(g);
		drawSquare2(g,200,300);
		drawSquare3(g,Color.blue,600,200);
		drawSquare4(g,Color.green,500,400,200);
	}

	public void drawSquare1(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(100,100,150,150);
	}

	public void drawSquare2(Graphics g, int x, int y)
	{
		g.setColor(Color.red);
		g.fillRect(x,y,150,150);
	}

	public void drawSquare3(Graphics g, Color color, int x, int y)
	{
		g.setColor(color);
		g.fillRect(x,y,150,150);
	}

	public void drawSquare4(Graphics g, Color color, int x, int y, int side)
	{
		g.setColor(color);
		g.fillRect(x,y,side,side);
	}
}

