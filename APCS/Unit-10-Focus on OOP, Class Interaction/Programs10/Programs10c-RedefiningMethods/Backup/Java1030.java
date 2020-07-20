// Java1030.java
// Each println statement includes a call to the <toString>
// method, which is defined to return the shallow value of 
// the object.

public class Java1030
{
	public static void main (String[] args)
	{
		Student tom = new Student(21,3.85);
		Student sue = new Student(17,3.65);
		Student bob = new Student(18,2.85);
		System.out.println("tom:  " + tom.toString());
		System.out.println("sue:  " + sue.toString());
		System.out.println("bob:  " + bob.toString());
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


