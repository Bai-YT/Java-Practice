// Java0524.java
// This program demonstrates program input protection with a compound condition.
// The <do...while> loop forces the user to re-enter when data is invalid.


import java.util.Scanner;


public class Java0524
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		char gender;
	   do
		{
			System.out.print("\nEnter Your Gender.  ===>>  ");
			gender = input.nextLine().charAt(0);
			System.out.println();

	      if (!(gender == 'M' || gender == 'F'))
	      {
			   System.out.println("Invalid Gender Entered: " + gender);
	        	System.out.println("You must enter M or F.");
	     	}
		}
		while (!(gender == 'M' || gender == 'F'));

      if (gender == 'M')
	      System.out.println("Your gender is Male.");
	   else
	      System.out.println("Your gender is Female.");
     	System.out.println("You may proceed.");
	}
}
