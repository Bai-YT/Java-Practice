// Java0910.java
// Cube Case Study #1
// Stage #1 presents a <Cube> class with a default constructor.
// This program does not display a cube yet.


import java.awt.*;
import java.applet.*;


public class Java0910 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube = new Cube();
	}
}


class Cube
{
	private int tlX;	// topleft X coordinate of the Cube's position
	private int tlY;	// topleft y coordinate of the Cube's position

	public Cube()
	{
		tlX = 50;
		tlY = 50;
	}
}




