// Java1201.java
// This program introduces the <ArrayList> class and the <add> method.
// Note that each name is added to the end of the list.
// Ignore the warning messages about "unsafe operations" which
// will be explained later and avoided.


import java.util.ArrayList;

public class Java1201
{
	public static void main(String[] args)
	{		
      ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println("names contains " + names);
  	}
}

