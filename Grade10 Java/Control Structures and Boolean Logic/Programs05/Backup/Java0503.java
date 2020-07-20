// Java0503.java
// This program demonstrates two-way selection with <if..else>.


import java.util.Scanner;


public class Java0503
{
	public static void main (String[] args)
	{
      Scanner input = new Scanner(System.in);

      System.out.print("Enter your SAT score.  -->  ");
      int sat = input.nextInt();
      System.out.println();

		if (sat >= 1100)
			System.out.println("You are admitted");
		else
			System.out.println("You are not admitted");
	}
}

