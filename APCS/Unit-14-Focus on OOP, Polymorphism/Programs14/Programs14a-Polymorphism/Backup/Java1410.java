// Java1410.java
// In this program polymorphism is achieved
// using a superclass as the umbrella.


public class Java1410
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


class Language
{
	public void greeting()
   {
      System.out.println("Every language has a greeting.");
   }
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