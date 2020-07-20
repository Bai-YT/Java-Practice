// Java0322.java
// This program corrects the logic error of Java0318.java.
// Type casting is used to "force" real number quotient division.


public class Java0322
{
	public static void main (String[] args)
	{
		int nr1 = 1000;
		int nr2 = 3000;
		int nr3 = 6000;
		double mean;
		mean = (double) (nr1 + nr2 + nr3) / 3;
		System.out.println("The mean equals:  " + mean);
		System.out.println();
	}
}

