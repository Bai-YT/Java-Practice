// Shape3Octagon.java
// Lab14a
// 100-Point solution with three polymorphic methods

import java.awt.*;



public class Shape3Octagon implements Shape
{
   private int numSides;
	private String shapeName;
	private int titleX, titleY;
   private int messageX, messageY;
   
   public Shape3Octagon()
   {
   	numSides  = 8;
    	shapeName = "Octagon";
    	titleX    =  20;
    	titleY    = 320;
    	messageX  = 100;
    	messageY  = 550;
    }

    public void drawShape(Graphics g)
    {
    	Polygon oct = new Polygon();
    	oct.addPoint(150,350);
    	oct.addPoint(200,350);
    	oct.addPoint(250,400);
    	oct.addPoint(250,450);
    	oct.addPoint(200,500);
    	oct.addPoint(150,500);
    	oct.addPoint(100,450);
    	oct.addPoint(100,400);
    	g.fillPolygon(oct);
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

