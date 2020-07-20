// Shape4Square.java
// Lab14a
// 100-Point solution with three polymorphic methods

import java.awt.*;


public class Shape4Circle implements Shape
{
   private int numSides;
	private String shapeName;
	private int titleX, titleY;
   private int messageX, messageY;
   
	public Shape4Circle()
   {
    	numSides  = 0;
    	shapeName = "Circle";
    	titleX    = 420;
    	titleY    = 320;
    	messageX  = 500;
    	messageY  = 550;
   }

   public void drawShape(Graphics g)
   {
    	g.fillOval(500,350,150,150);
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
