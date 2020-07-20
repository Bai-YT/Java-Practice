// Java0512.java
// This program demonstrates the postcondition <do..while> loop.
// This loop structure guarantees at least one repetition of
// the loop body.  Like the <while> loop this is not a
// "fixed iteration" loop.


import java.util.Scanner;


public class Java0512
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your ATM Personal Identification Number (PIN)!");
		System.out.println();
		int pin = 0;

		do
		{
			System.out.print("Enter your PIN  ==>>  ");
			pin = input.nextInt();
			System.out.println();
			if (pin != 1234)
				System.out.println("That is not the correct PIN.");
			System.out.println();
		}
		while (pin != 1234);

		System.out.println("Your PIN is correct; you may proceed.");
	}
}



