// Java0922.java
// Comparing the value of the three <Widget> objects demonstrates
// that the <this> reference value is equal to the current object used.


public class Java0922
{
	public static void main(String[] args)
	{
		Widget w1 = new Widget(100);
		System.out.println("w1 value:   " + w1);
		System.out.println();

		Widget w2 = new Widget(100);
		System.out.println("w2 value:   " + w2);
		System.out.println();

		Widget w3 = new Widget(100);
		System.out.println("w3 value:   " + w3);
		System.out.println();
	}
}


class Widget
{
	private int numWidgets;

	public Widget(int numWidgets)
	{
		this.numWidgets = numWidgets;
		System.out.println("this value: " + this);
	}
}

