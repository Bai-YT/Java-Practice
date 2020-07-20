// Java0518.java
// This program demonstrates nesting an <if..else> structure inside another <if..else> structure.
// This will determine if a student is eligible for financial aid.
// Note that this is not an issue for students whose SAT scores are below 1100.

import java.util.Scanner;


public class Java0518
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		System.out.print("Enter SAT  ===>>  ");
		int sat  = input.nextInt();
		System.out.println();

		if (sat >= 1100)
		{
			System.out.println("You are admitted");
			System.out.println("Orientation will start in June");

			System.out.println();
			System.out.print("What is your family income?  ===>>  ");
			int income  = input.nextInt();
			System.out.println();

			if (income <= 20000)
			{
				System.out.println("You qualify for financial aid.");
			}
			else
			{
				System.out.println("You do not qualify for financial aid.");
			}
		}
		else
		{
			System.out.println("You are not admitted");
			System.out.println("Please try again when your SAT improves.");
		}
	}
}

