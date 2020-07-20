// Java0813.java
// This program demonstrates using the <toUpperCase>
// and <toLowerCase> methods.


public class Java0813
{
	public static void main (String[] args)
	{
      String s1 = "aardVARK for SALE, only $12.00!";
      String s2 = "AARDvark FOR sale, ONLY $12.00!";
      String s3 = s1.toUpperCase();
      String s4 = s2.toLowerCase();

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println();
	}
}
