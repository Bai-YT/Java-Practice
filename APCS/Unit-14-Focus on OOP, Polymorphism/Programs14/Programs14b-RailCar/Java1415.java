// Java1415.java
// Train case study, Stage #3
// This program adds the <FreightCar> class,
// using inheritance, since a freight car is-a rail car.


import java.awt.*;
import java.applet.*;


public class Java1415 extends Applet
{
	public void paint(Graphics g)
	{
		FreightCar loc = new FreightCar(Color.gray,70,250);
		loc.drawCar(g);
	}
}


class FreightCar extends RailCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

	public FreightCar(Color cC, int xPos, int yPos)
	{
		super(cC,xPos,yPos);
      carColor = cC;
      this.xPos = xPos;
      this.yPos = yPos;
   }

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
		drawFreightDoors(g);
	}
   
	private void drawFreightDoors(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(xPos+30,yPos+10,90,60);
      g.drawLine(xPos+75,yPos+10,xPos+75,yPos+70);
      g.drawLine(xPos+30,yPos+10,xPos+75,yPos+70);
      g.drawLine(xPos+30,yPos+70,xPos+75,yPos+10);
      g.drawLine(xPos+75,yPos+10,xPos+120,yPos+70);
      g.drawLine(xPos+75,yPos+70,xPos+120,yPos+10);
      g.fillRect(xPos+66,yPos+35,5,15);
      g.fillRect(xPos+80,yPos+35,5,15);
	}
 }

