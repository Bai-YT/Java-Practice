// Java0919.java
// This program shows the logic problem that results from using two variables
// with the same name identifier, but two different scopes.


public class Java0919
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
		numWidgets = numWidgets;
	}

	public int getWidgets()
	{
		return numWidgets;
	}
}

