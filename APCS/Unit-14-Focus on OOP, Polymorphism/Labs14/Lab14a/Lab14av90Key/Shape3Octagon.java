// Shape3Octagon.java
// Lab14a
// 90-Pointsolution with two polymorphic methods

import java.awt.*;

public class Shape3Octagon implements Shape
{
   private String shapeName;
   private int titleX, titleY;
   
   public Shape3Octagon()
   {
  	   shapeName = "Octagon";
  	   titleX    =  20;
  	   titleY    = 320;
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

}

