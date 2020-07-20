// Java0528.java
// This program uses "short circuiting" and uses the isEven
// method to demonstrate short circuiting with logical or.


import java.util.Scanner;


public class Java0528
{

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1  ===>>  ");
		int n1 = input.nextInt();
		System.out.print("Enter number 2  ===>>  ");
		int n2 = input.nextInt();

		if (isEven(n1) || isEven(n2))
			System.out.println("At least one number is even.");
		else
			System.out.println("Both numbers are odd.");
	}

	public static boolean isEven(int number)
	{
		System.out.println();
		System.out.println("Calling isEven Method");
		System.out.println();
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

}



