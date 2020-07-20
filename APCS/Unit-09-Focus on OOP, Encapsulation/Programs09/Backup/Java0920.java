// Java0920.java
// Using different variable names is one solution to the
// problem caused by program Java0919.java.


public class Java0920
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

	public Widget(int nW)
	{
		numWidgets = nW;
	}

	public int getWidgets()
	{
		return numWidgets;
	}
}

