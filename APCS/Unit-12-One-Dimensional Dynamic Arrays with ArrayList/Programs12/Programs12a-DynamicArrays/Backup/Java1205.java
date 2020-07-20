// Java1205.java
// This program demonstrates the <remove> method of the <ArrayList> 
// class to delete a specified list element.
// Dynamic arrays change size when they get bigger or smaller.

import java.util.ArrayList;

public class Java1205
{
	public static void main(String[] args)
	{
		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
      System.out.println("names Size: " +names.size());

		System.out.println("names contains " + names);
		System.out.println();

		names.remove(2);
   	System.out.println("names contains " + names);
		System.out.println();

  		names.remove(3);
		System.out.println("names contains " + names);
      System.out.println("names Size: " +names.size());
  }
}

