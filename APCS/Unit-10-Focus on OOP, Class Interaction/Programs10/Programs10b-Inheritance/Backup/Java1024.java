// Java1024.java
// This program demonstrates inheritance at three levels.


public class Java1024
{
	public static void main(String[] args)
	{
		Cat tiger = new Cat("Tiger",500,5);
		System.out.println();
		System.out.println("Animal type:   " + tiger.getType());
		System.out.println("Animal weight: " + tiger.getWeight());
		System.out.println("Animal age:    " + tiger.getAge());
	}
}


class Animal
{
	private int age;

	public Animal(int a)
	{
		System.out.println("Animal Constructor Called");
		age = a;
	}

	public int getAge()
	{
		return age;
	}
}


class Mammal extends Animal
{
	private int weight;

	public Mammal(int w, int a)
	{
		super(a);
		weight = w;
		System.out.println("Mammal Constructor Called");
	}

	public int getWeight()
	{
		return weight;
	}
}

class Cat extends Mammal
{
	private String type;

	public Cat(String t, int w, int a)
	{
		super(w,a);
		type = t;
		System.out.println("Cat Constructor Called");
	}

	public String getType()
	{
		return type;
	}
}



