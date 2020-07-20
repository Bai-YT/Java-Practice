// Java0504.java
// This program demonstrates two-way selection with
// curly braces block-structure.


import java.util.Scanner;


public class Java0504
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

     	System.out.print("Enter your SAT score.  -->  ");
     	int sat = input.nextInt();
     	System.out.println();

		if (sat >= 1100)
      	{
         	System.out.println("Your SAT score of " + sat);
         	System.out.println("meets our expectations.");
			   System.out.println("You are admitted");
      	}
		else
      	{
         	System.out.println("Your SAT score of " + sat);
         	System.out.println("does not meet our expectations.");
			   System.out.println("You are not admitted");
      	}
   	}
}

