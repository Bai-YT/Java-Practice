// Shape.java
// Abstract interface of the Shapes Polymorphism program
// Lab14a
// 100-Pointsolution with three polymorphic methods

import java.awt.*;

public abstract interface Shape
{
	public abstract void drawShape(Graphics g);

	public abstract void displayName(Graphics g);

	public abstract void displayNumSides(Graphics g);
}

