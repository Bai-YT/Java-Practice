// Java1034.java
// This program tries to compare 2 person objects with the == operator.  
// This does not work because the == operator only checks the shallow value.
// It also does not give us a way to determine how we will check for equality.


public class Java1034
{
	public static void main (String[] args)
	{
		Person tom = new Person("Tom Jones",36,'M',40000);
		Person sue = new Person("Sue Smith",29,'F',50000);
		Person bob = new Person("Bob Brown",40,'M',50000);		
		System.out.println(tom);
		System.out.println(sue);
		System.out.println(bob);
		System.out.println();
		
		if (tom == sue)
			System.out.println("Tom and Sue are equal.");
		else
			System.out.println("Tom and Sue are not equal.");

		if (tom == bob)
			System.out.println("Tom and Bob are equal.");
		else
			System.out.println("Tom and Bob are not equal.");		
	
		if (sue == bob)
			System.out.println("Sue and Bob are equal.");
		else
			System.out.println("Sue and Bob are not equal.");	
		System.out.println();	
	}
}


class Person
{
	private String name;
	private int age;
	private char gender;
	private double salary;
	
	public Person(String n, int a, char g, double s)
	{
		name = n;
		age = a;
		gender = g;
		salary = s;
	}
	
	public String toString()
	{
		return "[" + name + ", "  + age + ", " + gender + ", " + salary + "]";
	}
}
