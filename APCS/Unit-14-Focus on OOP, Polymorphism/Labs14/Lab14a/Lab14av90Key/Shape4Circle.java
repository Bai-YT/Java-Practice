// Shape4Circle.java
// Lab14a
// 90-Pointsolution with two polymorphic methods

import java.awt.*;

public class Shape4Circle implements Shape
{
   private String shapeName;
   private int titleX, titleY;
   
   public Shape4Circle()
   {
  	   shapeName = "Circle";
  	   titleX    = 420;
  	   titleY    = 320;
   }

   public void drawShape(Graphics g)
   {
  	   g.fillOval(500,350,150,150);
   }
    
   public void displayName(Graphics g)
   {
  	   g.drawString(shapeName, titleX, titleY);
   }
  
}
