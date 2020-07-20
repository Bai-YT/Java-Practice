// Java1204.java
// This program demonstrates the <set> method of the <ArrayList> class, which
// replaces existing elements with a new object.
// Note that the <set> method is a return method that returns the last
// element value before it is replaced.

import java.util.ArrayList;

public class Java1204
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
		System.out.println();

		names.set(1,"Jessica");
		names.set(2,"Anthony");
		names.set(3,"Haley");
		System.out.println(names.set(4,"Alec"));

		System.out.println("names contains " + names);
	}
}

