// Java1212.java
// Generics make sure that an array is in fact an array.  An array
// is supposed to be a data structure with elements of the same type.
// This program example - which does not use generics - allows the
// list array to store three different data types.


import java.util.ArrayList;

public class Java1212
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(new Double(3.14159));
		list.add(new Integer(200));
		list.add(new String("Dubrovnik"));
		System.out.println(list);
	}
}


