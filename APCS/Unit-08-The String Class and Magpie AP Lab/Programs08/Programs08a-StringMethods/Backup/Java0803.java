// Java0803.java
// This program demonstrates how to access specified characters of
// a string with the <substring(P,Q)> method, where P is the Start-Index and
// Q is one greater than the End-Index.


public class Java0803
{
	public static void main (String[] args)
	{
   	String s = "Racecar";
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2,6));
		System.out.println(s.substring(3,6));
		System.out.println(s.substring(4,7));
		System.out.println();
	}
}

