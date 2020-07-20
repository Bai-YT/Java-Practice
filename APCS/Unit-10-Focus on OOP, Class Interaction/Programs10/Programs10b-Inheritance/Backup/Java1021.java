// Java1021.java
// Note: The <Person> constructor is called, even though there does
// not appear to be a <Person> object instantiated.


public class Java1021
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
		System.out.println("Student Constructor");
		grade = 12;
	}

	public int getGrade()
	{
		return grade;
	}
}
