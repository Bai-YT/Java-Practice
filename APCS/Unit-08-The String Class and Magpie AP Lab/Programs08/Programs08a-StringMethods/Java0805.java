// Java0805.java
// This program shows the <indexOf> method, which returns the index of the first
// occurrence of the string argument or -1 if the string is not found.


public class Java0805
{
	public static void main (String[] args)
	{
		String s1 = "racecar";
		String s2 = "racecar in the carport";
		String s3 = "car";
		int index1 = s1.indexOf(s3);
		int index2 = s2.indexOf(s3);
		int index3 = s3.indexOf("qwerty");
		System.out.println("With \"" + s1 + "\" car starts at " + index1);
		System.out.println("With \"" + s2 + "\" car starts at " + index2);
		System.out.println("With \"" + s3 + "\" Qwerty shows up at " + index3);
		System.out.println();
	}
}
