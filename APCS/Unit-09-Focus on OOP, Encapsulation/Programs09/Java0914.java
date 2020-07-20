// Java0914.java
// Cube Case Study #5
// Stage #5 adds an <erase> method, which erases the cube at the current [tlX,tlY] coordinates.
// This program has a problem because the cube object is erased immediately after it is drawn.


import java.awt.*;
import java.applet.*;


public class Java0914 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube = new Cube(50,50,50);
		for (int x = 50; x < 750; x += 50)
		{
			cube.move(g,x,300);
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
}




