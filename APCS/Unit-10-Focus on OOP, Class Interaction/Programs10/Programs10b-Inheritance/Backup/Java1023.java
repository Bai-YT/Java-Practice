// Java1023.java
// This program demonstrates how a subclass constructor passes
// parameter information to a superclass constructor.


public class Java1023
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

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	private int grade;

	public Student(int g, int a)
	{
		super(a);   // required for superclass parameter constructors
		grade = g;
		System.out.println("Student Parameter Constructor");
	}

	public int getGrade()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + getGrade());
		System.out.println("Student's Age is " + getAge());
	}
}


