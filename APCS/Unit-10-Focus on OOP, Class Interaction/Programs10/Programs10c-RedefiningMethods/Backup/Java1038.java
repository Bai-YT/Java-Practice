// Java1038.java
// This program shows the correct re-definition of the <equals> method.
// The heading uses <Object> and requires class casting.


public class Java1038
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
		name = n;   age = a;   gender = g;   salary = s;
	}
	
	public String toString()
	{
		return "[" + name + ", "  + age + ", " + gender + ", " + salary + "]";
	}
	
	public boolean equals(Object that)
	{
		return 	this.salary  == ( (Person) that).salary;
	}
}
