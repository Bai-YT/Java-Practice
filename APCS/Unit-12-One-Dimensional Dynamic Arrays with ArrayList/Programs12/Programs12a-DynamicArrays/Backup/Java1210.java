// Java1210.java
// Since Java Version 5.0 the "casting" solution of the last program is so
// "old Java version".  It is now possible to specify, at the time that the
// <ArrayList> object is constructed, what kind of object is stored.
// Note: the "unsafe operations" warning is now also gone.


import java.util.ArrayList;

public class Java1210
{
	public static void main(String[] args)
	{
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Joe",21));
		people.add(new Person("Sue",20));

      Person student1 = people.get(0);
      Person student2 = people.get(1);
	}
}


class Person
{
	private String name;
	private int age;

	public Person (String n, int a)
	{
		name = n;
		age = a;
	}
}
