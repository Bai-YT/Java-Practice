// Java1035.java
// This program tries to compare two <Person> objects with the <equals< method.  
// This also does not work because we have not "re-defined" the <equals> method 
// for the <Person> class, and we are simply inheriting the <equals> method from
// the <Object> class, which only checks the shallow value.


public class Java1035
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
}
