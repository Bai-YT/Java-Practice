// Java0918.java
// This program demonstrates the scope of a variable.


public class Java0918
{
	public static void main(String[] args)
	{
		int var1 = 10;
		System.out.println("var1 in main is " + var1);

		System.out.print("var2 inside the main method for loop is ");
		for (int var2 = 1; var2 < 10; var2++)
		{
			System.out.print(var2 + "  ");
		}

		System.out.println();
		Boo boo = new Boo(var1);
		System.out.println("var4 in Boo is " + boo.getData());

		System.out.println();
	}
}


class Boo
{
	private int var4;

	public Boo(int var3)
	{
		var4 = var3;
		System.out.println("var3 in constructor is " + var3);
	}

	public int getData()
	{
		return var4;
	}
}

