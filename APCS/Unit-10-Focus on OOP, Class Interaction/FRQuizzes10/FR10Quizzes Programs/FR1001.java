
public class FR1001
{
   public static void main(String[] args)
   {
      Car car = new Car("Chevy",200);
   }   
}


class Engine
{
	private int horsePower;
	
	public Engine(int hp)
	{
		horsePower = hp;
	}
}



class Car
{
	String type;
	Engine engine;
		
	public Car(String t, int hp)
	{
		type = t;
		engine = new Engine(hp);
	}
}
