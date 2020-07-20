// Lab14av100.java
// Lab14a
// 100-Point solution with three polymorphic methods


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14av100 extends Applet
{
	public void paint(Graphics g)
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Shape1Square());
		shapes.add(new Shape2Triangle());
		shapes.add(new Shape3Octagon());
		shapes.add(new Shape4Circle());

		drawGrid(g);

		for(Shape shape: shapes)
		{
			shape.drawShape(g);
			shape.displayName(g);
			shape.displayNumSides(g);
      }	
	}

	public void drawGrid(Graphics g)
	{
      g.drawRect(10,10,800,600);
		g.drawLine(10,300,810,300);
		g.drawLine(410,10,410,610);
	}
}

