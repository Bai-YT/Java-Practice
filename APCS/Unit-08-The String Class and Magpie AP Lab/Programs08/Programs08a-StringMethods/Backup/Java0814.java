// Java0814.java
// This program utilized the new methods added to the <Utility> class.


public class Java0814
{
	public static void main (String[] args)
	{
		Utility.skip(3);
      System.out.println("Text output is left-justified by default.");
      Utility.skip(4);
      Utility.rightJustify("This text is right-justified.");
      Utility.skip(5);
      Utility.center("This text is centered.");
      Utility.skip(2);
	}
}
