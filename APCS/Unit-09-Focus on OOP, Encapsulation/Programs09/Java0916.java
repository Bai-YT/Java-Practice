// Java0916.java
// Cube Case Study #7
// Stage #7 adds three get methods that return the instance variable values.
// They are methods <getX>, <getY> and <getSize>.


import java.awt.*;
import java.applet.*;


public class Java0916 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube = new Cube(400,300,200);
		cube.draw(g);
		System.out.println("Top Left X: " + cube.getX());
		System.out.println("Top Left Y: " + cube.getY());
		System.out.println("Cube Size:  " + cube.getSize());
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

	public int getX()
	{
		return tlX;
	}

	public int getY()
	{
		return tlY;
	}

	public int getSize()
	{
		return size;
	}

}




