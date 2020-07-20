// Shape1Square.java
// Lab14a
// 90-Pointsolution with two polymorphic methods

import java.awt.*;

public class Shape1Square implements Shape
{
   private String shapeName;
   private int titleX, titleY;

   public Shape1Square()
   {
 	   shapeName = "Square";
 	   titleX    = 20;
 	   titleY    = 60;
   }

   public void drawShape(Graphics g)
   {
  	   g.fillRect(100,50,150,150);
   }
   
   public void displayName(Graphics g)
   {
  	   g.drawString(shapeName, titleX, titleY);
   }

}

