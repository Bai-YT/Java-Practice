// Java1409.java
// In this program polymorphism is achieved
// using an abstract superclass as the umbrella.


public class Java1409
{
	public static void main (String[] args)
	{
      Language g1 = new English();
      Language g2 = new German();
      Language g3 = new Dutch();
      Language g4 = new French();
      printGreeting(g1);
      printGreeting(g2);
      printGreeting(g3);
      printGreeting(g4);
	}
   
   public static void printGreeting(Language obj)
   {
      obj.greeting();
   }
}


abstract class Language
{
	public abstract void greeting();
}

class English extends Language
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German extends Language
{
	public void greeting()
	{
		System.out.println("In German you say Guten Tag");
	}
}

class Dutch extends Language
{
	public void greeting()
	{
		System.out.println("In Dutch you say Goeden Dag");
	}
}

class French extends Language
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}