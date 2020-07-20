// Shape1Square.java
// Lab14a
// 100-Point solution with three polymorphic methods

import java.awt.*;

public class Shape1Square implements Shape
{
   private int numSides;
	private String shapeName;
	private int titleX, titleY;
   private int messageX, messageY;
   
	public Shape1Square()
   {
      numSides  = 4;
    	shapeName = "Square";
    	titleX    = 20;
    	titleY    = 60;
    	messageX  = 100;
    	messageY  = 250;
   }

   public void drawShape(Graphics g)
   {
    	g.fillRect(100,50,150,150);
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

