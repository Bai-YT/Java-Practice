// Java1418.java
// Train case study, Stage #6
// This program adds the <Caboose> class,
// using inheritance, since a caboose "is-a" rail car.


import java.awt.*;
import java.applet.*;


public class Java1418 extends Applet
{
	public void paint(Graphics g)
	{
		Caboose cab = new Caboose(Color.red,580,250);
		cab.drawCar(g);
	}
}


class Caboose extends RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public Caboose(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawWindows(g);
		drawCupola(g);
	}

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+30,yPos+30,30,30);
	    g.fillRect(xPos+90,yPos+30,30,30);
	}

	private void drawCupola(Graphics g)
	{
	    g.setColor(Color.red);
	    g.fillRect(xPos+30,yPos-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,yPos-30,100,5);
	}
}

