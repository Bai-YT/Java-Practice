// Java0921.java
// Using the <this> reference is a second solution to the
// problem in program Java0919.java.


public class Java0921
{
	public static void main(String[] args)
	{
		Widget w = new Widget(100);
		System.out.println("Object w has " + w.getWidgets() + " widgets");
	}
}


class Widget
{
	private int numWidgets;

	public Widget(int numWidgets)
	{
		this.numWidgets = numWidgets;	// required use of this
	}

	public int getWidgets()
	{
		return this.numWidgets;			// optional use of this
	}
}

