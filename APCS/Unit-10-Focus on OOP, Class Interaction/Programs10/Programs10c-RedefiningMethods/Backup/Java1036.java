// Java1036.java
// This program properly compares two person objects with the redefined equals method.  
// It chooses to define "equality" solely based on a Person's salary, which may be 
// overly capitalistic, but still makes a point.


public class Java1036
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
		
		if (tom.equals(sue))
			System.out.println("Tom and Sue are equal.");
		else
			System.out.println("Tom and Sue are not equal.");

		if (tom.equals(bob))
			System.out.println("Tom and Bob are equal.");
		else
			System.out.println("Tom and Bob are not equal.");		
	
		if (sue.equals(bob))
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
	
	public boolean equals(Person temp)
	{
		return salary == temp.salary;
	}
}
