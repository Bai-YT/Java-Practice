public class Test1020
{
	public static void main(String args[])
	{
      Engine engine = new Engine();
	}
}

class Engine 
{
   private Car car;
   
	public Engine()
	{
      car = new Car();
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


