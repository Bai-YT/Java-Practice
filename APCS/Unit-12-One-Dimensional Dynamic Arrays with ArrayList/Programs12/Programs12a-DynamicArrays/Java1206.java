// Java1206.java
// This program demonstrates how to use the overloaded <add> method of the 
// <ArrayList> class to insert new elements at a specified location.

import java.util.ArrayList;

public class Java1206
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

		names.add(2,"Jessica");
		System.out.println("names contains " + names);
		System.out.println();

  		names.add(3,"Anthony");
		System.out.println("names contains " + names);
  	}
}

