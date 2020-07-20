// Shape2Triangle.java
// Lab14a
// 80-Point solution with one polymorphic method

import java.awt.*;

public class Shape2Triangle implements Shape
{
   public void drawShape(Graphics g)
   {
      Polygon tri = new Polygon();
    	tri.addPoint(500,200);
    	tri.addPoint(700,200);
    	tri.addPoint(600,50);
    	g.fillPolygon(tri);
   }
}

