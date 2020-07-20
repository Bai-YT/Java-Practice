// Java0525.java
// This program uses a <boolean> variable to make the program more readable.
// The program also handles lower-case input for gender.


import java.util.Scanner;


public class Java0525
{
	public static void main (String[] args)
	{
     	Scanner input = new Scanner(System.in);

		char gender;
		boolean genderInvalid;
		do
		{
			System.out.print("Enter Your Gender.  ===>>  ");
			gender = input.nextLine().charAt(0);
			System.out.println();

			genderInvalid = !(gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f');

      	if (genderInvalid)
      	{
		   	System.out.println("Invalid Gender Entered: " + gender);
         	System.out.println("You must enter M or F.");
      	}
		}
		while (genderInvalid);

	   if (gender == 'M' || gender == 'm')
	      System.out.println("Your gender is Male.");
	   else
	      System.out.println("Your gender is Female.");
      System.out.println("You may proceed.");
	}
}
