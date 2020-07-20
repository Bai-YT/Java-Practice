// Java1202.java
// This program uses the <size> method to determine the number of elements
// in an <ArrayList> object. The <length> field is only for static arrays.
// Note that the value returned by the <size> method changes when more names
// are added to the <ArrayList> object.

import java.util.ArrayList;

public class Java1202
{
	public static void main(String[] args)
	{
		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		System.out.println("names contains " + names);;
		System.out.println("There are " + names.size() + " elements in the names object.");

		names.add("Maria");
		names.add("Heidi");
		System.out.println("names contains " + names);
		System.out.println("There are " + names.size() + " elements in the names object.");
  	}
}

