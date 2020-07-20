// Java1029.java
// In this program objects of a user-defined <Student> class are used with <print> statements.

public class Java1029
{
	public static void main (String[] args)
	{
		Student tom = new Student(21,3.85);
		Student sue = new Student(17,3.65);
		Student bob = new Student(18,2.85);
		System.out.println("tom:  " + tom);
		System.out.println("sue:  " + sue);
		System.out.println("bob:  " + bob);
	}
}


class Student
{
	private int age;
	private double gpa;
	
	public Student(int a, double g)
	{
		age = a;
		gpa = g;
	}
}


