// Lab08v100.java
// The "Palindrome" Program
// This is the solution file for the 100-point version of Lab 08.

import java.util.Scanner;

public class Lab08v100
{
	public static void main (String[] args)
	{
      Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do
		{
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));	  // used only for the 100 point version
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		}
		while (notFinished);
	}
}



class Palindrome
{
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
	 */
	public static boolean isPal(String s)
	{
		String temp = "";
      s = s.toUpperCase();  // This line is added for the 100 point version.
      int n = s.length() - 1;
		for (int k = n; k >= 0; k--)
			temp += s.substring(k,k+1);
		return s.equals(temp);
	}  
   
   /*
	 * Precondition:  s is a String of one character.
	 * Postcondition: The value of true is returned if s is a letter and false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
   private static boolean isLetter(String letter)
   {
      boolean greaterThanA = letter.compareTo("A") > 0; 
      boolean lessThanZ = letter.compareTo("Z") < 0;
      return greaterThanA && lessThanZ;
   }
   
   
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	private static String purge(String s)
	{
		s = s.toUpperCase();
		String temp = "";
		for (int k = 0; k < s.length(); k++)
      {
			String tempChar = s.substring(k,k+1);
         if (isLetter(tempChar))
				temp += s.substring(k,k+1);
      }
		return temp;
	}
   
   /*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: After purging all non-letter characters from s,
	 *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	public static boolean almostPal(String s)
	{
      if (isPal(s))
      {
         return false;
      }
      else
      {
	      String purgedPhrase = purge(s);
         return isPal(purgedPhrase);
      }  
	}

}

