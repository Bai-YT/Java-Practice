public class Test1021
{
	public static void main(String args[])
	{
      Car car = new Car();
      Engine engine = new Engine();
	}
}

class Engine extends Car 
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


