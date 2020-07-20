// Shape2Triangle.java
// Lab14a
// 100-Point solution with three polymorphic methods

import java.awt.*;


public class Shape2Triangle implements Shape
{
   private int numSides;
	private String shapeName;
	private int titleX, titleY;
   private int messageX, messageY;
   
	public Shape2Triangle()
    {
    	numSides  = 3;
    	shapeName = "Triangle";
    	titleX    = 420;
    	titleY    =  60;
    	messageX  = 500;
    	messageY  = 250;
    }

    public void drawShape(Graphics g)
    {
    	Polygon tri = new Polygon();
    	tri.addPoint(500,200);
    	tri.addPoint(700,200);
    	tri.addPoint(600,50);
    	g.fillPolygon(tri);
    }
    
    public void displayName(Graphics g)
    {
    	g.drawString(shapeName, titleX, titleY);
    }
 
    public void displayNumSides(Graphics g)
    {
    	g.drawString("A " + shapeName + " has " + numSides + " sides.", messageX, messageY);
    }


}

