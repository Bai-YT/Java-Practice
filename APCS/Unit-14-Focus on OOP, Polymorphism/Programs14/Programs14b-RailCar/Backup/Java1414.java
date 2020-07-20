// Java1414.java
// Train case study, Stage #2
// This program improves the <RailCar> class by constructing
// new objects with a specified color and a specified location.


import java.awt.*;
import java.applet.*;


public class Java1414 extends Applet
{
	public void paint(Graphics g)
	{
		RailCar rc1 = new RailCar(Color.blue,100,250);
		RailCar rc2 = new RailCar(Color.green,275,250);
		RailCar rc3 = new RailCar(Color.yellow,450,250);
		RailCar rc4 = new RailCar(Color.magenta,625,250);
		rc1.drawCar(g);
		rc2.drawCar(g);
		rc3.drawCar(g);
		rc4.drawCar(g);
	}
}


class RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public RailCar(Color cC, int xP, int yP)
	{
		carColor = cC;
		xPos = xP;
		yPos = yP;
	}

	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
   
   private void drawContainer(Graphics g)
   {
   	g.setColor(carColor);
   	g.fillRect(xPos,yPos,150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(xPos-25,yPos+80,25,5);
   }
}

