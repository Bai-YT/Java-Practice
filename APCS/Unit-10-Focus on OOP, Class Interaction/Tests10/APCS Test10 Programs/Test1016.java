public class Test1016
{
	public static void main(String args[])
	{
      Car car = new Car();
	}
}

class Engine extends Car
{
	public Engine()
	{
		System.out.println("Engine Constructor");
	}
}

class Car 
{ 
	public Car()
	{
		System.out.println("Car Constructor");
	}
}


