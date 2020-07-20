// Java0527.java
// This program fixes the error of the previous program by properly using Demorgan's Law.


import java.util.Scanner;


public class Java0527
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		char gender;
		boolean genderInvalid;
		do
		{
			System.out.print("\nEnter Your Gender.  ===>>  ");
			gender = input.nextLine().charAt(0);
			System.out.println();

			genderInvalid = gender != 'M' && gender != 'F';

	      	if (genderInvalid)
	      	{
			   	System.out.println("Invalid Gender Entered: " + gender);
	         	System.out.println("You must enter M or F");
	      	}
		}
		while (genderInvalid);

	   if (gender == 'M')
	        System.out.println("Your gender is Male.");
	   else
	      System.out.println("Your gender is Female.");
     	System.out.println("You may proceed");
	}
}
