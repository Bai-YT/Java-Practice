public class Test1017
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
	public Car()
	{
		System.out.println("Car Constructor");
	}
}


