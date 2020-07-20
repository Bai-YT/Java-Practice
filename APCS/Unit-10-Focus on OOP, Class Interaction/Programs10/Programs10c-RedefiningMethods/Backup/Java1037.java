// Java1037.java
// This program defines equality differently from the previous programs. 
// Now all data fields must match for two Person objects to be considered equal.  
// A special <this> reference in the equals method helps to distinguish the two objects.
// NOTE: It is not uncommon for the equals method from one class to call the 
// equals method from another class.


public class Java1037
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
	
   public boolean equals(Person that)
	{
		return 	this.name.equals(that.name)  	&& 
		       	this.age     ==  that.age     &&
      	      this.gender  ==  that.gender  &&
		       	this.salary  ==  that.salary;
	}
}
