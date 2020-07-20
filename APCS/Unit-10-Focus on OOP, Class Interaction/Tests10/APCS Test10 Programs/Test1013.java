public class Test1013
{
	public static void main(String args[])
	{
      Car car = new Car();
	}
}

class Engine 
{
	public Engine()
	{
		System.out.println("Engine Constructor");
	}
}

class Car extends Engine
{ 
	public Car()
	{
		System.out.println("Car Constructor");
	}
}


