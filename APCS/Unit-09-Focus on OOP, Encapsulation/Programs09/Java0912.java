// Java0912.java
// Cube Case Study #3
// Stage #3 adds a second, overloaded constructor.  
// It is now possible to specify the size and the 
// location of the cube.  The <draw> method needs 
// to be altered to handle different cube sizes.


import java.awt.*;
import java.applet.*;


public class Java0912 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube1 = new Cube(50,50,50);
		cube1.draw(g);
		Cube cube2 = new Cube(400,50,100);
		cube2.draw(g);
		Cube cube3 = new Cube(50,300,150);
		cube3.draw(g);
		Cube cube4 = new Cube(400,300,200);
		cube4.draw(g);
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
}




