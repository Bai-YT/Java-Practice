// Java0812.java
// This program demonstrates using the <trim> method, which removes all
// white space characters at the beginning and end of a string object.
// NOTE: "White Spaces" are invisible characters like spaces and tabs.


public class Java0812
{
	public static void main (String args[])
	{
      String s1 = "AARDVARK";
      String s2 = "     AARDVARK\t\t";
      String s3 = s1.trim();
      String s4 = s2.trim();

      System.out.println("start" + s1 + "end");
      System.out.println("start" + s2 + "end");
      System.out.println("start" + s3 + "end");
      System.out.println("start" + s4 + "end");
      System.out.println();

		System.out.println("s1 length: " +  s1.length());
      System.out.println("s2 length: " +  s2.length());
      System.out.println("s3 length: " +  s3.length());
      System.out.println("s4 length: " +  s4.length());
	}
}
