// Java1022.java
// This program adds a call to <super> in the <Student> constructor.
// The program output is identical to the previous program.
// Java automatically makes the call to <super>.


public class Java1022
{
	public static void main(String[] args)
	{
		Student tom = new Student();
		System.out.println("tom's age is   " + tom.getAge());
		System.out.println("tom's grade is " + tom.getGrade());
	}
}


class Person
{
	private int age;

	public Person()
	{
		System.out.println("Person Constructor");
		age = 17;
	}

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	private int grade;

	public Student()
	{
		super();  // not required; Java makes this call
		System.out.println("Student Constructor");
		grade = 12;
	}

	public int getGrade()
	{
		return grade;
	}
}
