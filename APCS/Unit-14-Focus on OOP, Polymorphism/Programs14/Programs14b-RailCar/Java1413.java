// Java1413.java
// Train case study, Stage #1
// The first stage starts with the <RailCar> class.
// The rail car has a fixed location and position.
// Three objects all display in top of each other.


import java.awt.*;
import java.applet.*;


public class Java1413 extends Applet
{
	public void paint(Graphics g)
	{
		RailCar rC1 = new RailCar();
      RailCar rC2 = new RailCar();	
      RailCar rC3 = new RailCar();
		rC1.drawCar(g);
      rC2.drawCar(g);
      rC3.drawCar(g);
	}
}


class RailCar
{
	private Color carColor;

	public RailCar()
	{
		carColor = Color.blue;
	}

	public void drawCar(Graphics g)
	{
		g.setColor(carColor);
		g.fillRect(325,250,150,100);
		g.setColor(Color.black);
		g.fillOval(330,325,50,50);
		g.fillOval(420,325,50,50);
	}
}
