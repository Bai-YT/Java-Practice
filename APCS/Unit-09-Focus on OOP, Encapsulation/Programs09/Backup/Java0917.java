// Java0917.java
// This program demonstrates how one variable name <counter> can be
// declared twice correctly.
// It also shows <myAge> declared twice incorrectly.


public class Java0917
{
	public static void main(String[] args)
	{
		for (int counter = 1; counter <= 5; counter++)
      {
			System.out.print(counter + "  ");
      }

		for (int counter = 10; counter <= 15; counter++)
      {
			System.out.print(counter + "  ");
      }

		int myAge = 16;
		int myAge = 25;
	}
}

