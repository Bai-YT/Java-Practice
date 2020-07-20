// Java0915.java
// Cube Case Study #6
// Stage #6 adds a <delay> method which stops program execution for a specified number of
// milli seconds.  This makes the cube visible and creates a simple type of animation.


import java.awt.*;
import java.applet.*;


public class Java0915 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube = new Cube(50,50,50);
		for (int x = 50; x <= 950; x += 20)
		{
			cube.move(g,x,300);
			cube.delay(100);
			cube.erase(g);
		}
	}
}


class Cube
{
	private int tlX;	// topleft X coordinate of the Cube's position
	private int tlY;	// topleft y coordinate of the Cube's position
	private int size;	// the size of the cube along one edge

	public Cube()
	{
		tlX = 50;
		tlY = 50;
		size = 50;
	}

	public Cube(int x, int y, int s)
	{
		tlX = x;
		tlY = y;
		size = s;
	}

	public void draw(Graphics g)
	{
		int tlX2 = tlX + size/3;
		int tlY2 = tlY + size/3;
		g.setColor(Color.black);
		g.drawRect(tlX,tlY,size,size);
		g.drawRect(tlX2,tlY2,size,size);
		g.drawLine(tlX,tlY,tlX2,tlY2);
		g.drawLine(tlX+size,tlY,tlX2+size,tlY2);
		g.drawLine(tlX,tlY+size,tlX2,tlY2+size);
		g.drawLine(tlX+size,tlY+size,tlX2+size,tlY2+size);
	}

	public void move(Graphics g, int x, int y)
	{
		tlX = x;
		tlY = y;
		draw(g);
	}

	public void erase(Graphics g)
	{
		int tlX2 = tlX + size/3;
		int tlY2 = tlY + size/3;
		g.setColor(Color.white);
		g.drawRect(tlX,tlY,size,size);
		g.drawRect(tlX2,tlY2,size,size);
		g.drawLine(tlX,tlY,tlX2,tlY2);
		g.drawLine(tlX+size,tlY,tlX2+size,tlY2);
		g.drawLine(tlX,tlY+size,tlX2,tlY2+size);
		g.drawLine(tlX+size,tlY+size,tlX2+size,tlY2+size);
	}

	public void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();
	}
}




