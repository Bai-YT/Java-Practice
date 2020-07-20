// Java0502.java
// This program demonstrates one-way selection
// using curly "container" braces to create block structure.


import java.util.Scanner;


public class Java0502
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		int bonus = 250;
      	System.out.print("Enter Sales  ===>>  ");
      	int sales = input.nextInt();
      	System.out.println();

		if (sales > 500000)
		{
			bonus += 500;
			System.out.println("Your sales are greater than $500,000.");
			System.out.println("You will receive an extra $500 bonus.");
		}
		System.out.println("Total Yearly bonus: " + bonus);
	}
}

