// Java1208.java
// This program has no output, which does not matter, because it does not compile.
// You will see two "incompatible types" syntax errors.  This may seem strange
// because the <ArrayList> object stores <Person> objects.


import java.util.ArrayList;

public class Java1208
{
	public static void main(String[] args)
	{
		ArrayList people = new ArrayList();
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
