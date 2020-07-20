// Java0520.java
// This program displays several multiplication tables using
// a nested <for> loop structures.


public class Java0520
{
	public static void main(String[] args)
	{     
		for (int table = 11; table <= 13; table++)
		{
			for (int k = 1; k <= 5; k++)
			{
				System.out.println(k + " * " + table + " = " + k * table);
			}
			System.out.println();
		}
	}
}


