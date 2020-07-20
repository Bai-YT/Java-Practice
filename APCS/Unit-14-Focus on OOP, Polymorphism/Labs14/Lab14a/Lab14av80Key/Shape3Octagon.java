// Shape3Octagon.java
// Lab14a
// 80-Pointsolution with one polymorphic method

import java.awt.*;

public class Shape3Octagon implements Shape
{
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
}

