// Java0522.java
// This program demonstrates compound decisions with the logical or ( || ) operator.


import java.util.Scanner;


public class Java0522
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

     	System.out.print("Enter # of years of Education.        ===>>  ");
		int education = input.nextInt();
		System.out.print("Enter # of years of Work Experience.  ===>>  ");
      	int experience = input.nextInt();
      	System.out.println();

		if (education >= 16 || experience >= 5)
			System.out.println("You are hired");
		else
			System.out.println("You are not qualified");
	}
}
