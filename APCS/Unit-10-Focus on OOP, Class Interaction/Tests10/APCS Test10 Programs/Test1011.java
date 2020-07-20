public class Test1011
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

class Car
{
   private Engine engine;
   
	public Car()
	{
      engine = new Engine();
		System.out.println("Car Constructor");
	}
}


