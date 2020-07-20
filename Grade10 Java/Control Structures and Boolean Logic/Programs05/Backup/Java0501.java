// Java0501.java
// This program demonstrates one-way selection with <if>.


import java.util.Scanner;


public class Java0501
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		int bonus = 250;
      	System.out.print("Enter Sales  ===>>  ");
      	int sales = input.nextInt();

		if (sales >= 500000)
			bonus += 500;

		System.out.println("\nYearly bonus: " + bonus);
	}
}
