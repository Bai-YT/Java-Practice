// Java1025.java
// This program demonstrates that it is possible to distinguish between
// two methods with the same identifier using <super>.


public class Java1025
{
	public static void main(String[] args)
	{
		Student tom = new Student(12,17);
		tom.showData();
	}
}


class Person
{
	private int age;

	public Person(int a)
	{
		System.out.println("Person Parameter Constructor");
		age = a;
	}

	public int getData()
	{
		return age;
	}
}


class Student extends Person
{
	private int grade;

	public Student(int g, int a)
	{
		super(a);
		grade = g;
		System.out.println("Student Parameter Constructor");
	}

	public int getData()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + getData());
		System.out.println("Student's Age is   "  + super.getData());
	}
}
