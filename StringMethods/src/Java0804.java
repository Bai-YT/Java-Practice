// Java0804.java
// This program compares the two <substring> methods.
// Java can tell the difference, because of the different
// parameter signatures.


public class Java0804
{
	public static void main (String[] args)
	{
		String s = "Racecar";
		int n = s.length();
		for  (int k = 0; k < n; k++)
			System.out.print(s.substring(n-k-1, n-k));
		//System.out.println();
		//for  (int k = 0; k < n; k++)
		//	System.out.println(s.substring(k,n));
		//System.out.println();
	}
}
