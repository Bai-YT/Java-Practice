// Java0519.java
// This program determine your graduation status based on your college GPA
// using multiple nested <if..else> statements.
// This is necessary because <switch> only works with integers, characters and strings.


import java.util.Scanner;


public class Java0519
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		System.out.print("Enter GPA  ===>>  ");
		double gpa  = input.nextDouble();
		System.out.println();

		if (gpa >= 3.9)
			System.out.println("Summa Cum Laude");
		else if (gpa >= 3.75)
			System.out.println("Magna Cum Laude");
		else if (gpa >= 3.5)
			System.out.println("Cum Laude");
		else if (gpa >= 2.0)
			System.out.println("Graduate without honors");
		else
			System.out.println("Will not graduate");

		System.out.println();
	}
}

