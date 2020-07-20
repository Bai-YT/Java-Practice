// Java0808.java
// This program converts string values to int and double values using
// the <parseInt> and <parseDouble> methods of the <Integer> and <Double> classes.


public class Java0808
{
	public static void main (String[] args)
	{
		String s1 = "12345";
		String s2 = "123.321";
      String s3 = "811 Fleming Trail";

		int n1 = Integer.parseInt(s1);
		double n2 = Double.parseDouble(s2);
//    int n3 = Integer.parseInt(s3);

		System.out.println(n1 + " + " + n1 + " = " + (n1 + n1));
		System.out.println(n2 + " + " + n2 + " = " + (n2 + n2));
//    System.out.println(n3 + " + " + n3 + " = " + (n3 + n3));
	}
}
