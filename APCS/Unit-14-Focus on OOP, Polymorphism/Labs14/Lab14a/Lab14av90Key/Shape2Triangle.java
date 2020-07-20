// Shape2Triangle.java
// Lab14a
// 90-Pointsolution with two polymorphic methods

import java.awt.*;

public class Shape2Triangle implements Shape
{
   private String shapeName;
   private int titleX, titleY;
   
   public Shape2Triangle()
   {
    	shapeName = "Triangle";
    	titleX    = 420;
    	titleY    =  60;
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

}

