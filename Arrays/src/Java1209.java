// Java1209.java
// This program compiles and there is still no output.  Output is not the
// issue.  Understanding the correct syntax involved does matter.
// In this case lines 18 and 19 cast to the <Person> class, which makes
// Java happy.  Without casting the data types are unknown.


import java.util.ArrayList;

public class Java1209
{
	public static void main(String[] args)
	{
		ArrayList people = new ArrayList();
		people.add(new Person("Joe",21));
		people.add(new Person("Sue",20));

      Person student1 = (Person) people.get(0);
      Person student2 = (Person) people.get(1);
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
