// Java1407b.java
// This version of Java1407.java
// declares every concrete class with its own class.


public class Java1407b
{
	public static void main (String[] args)
	{
      English g1 = new English();
      German g2 = new German();
      Dutch g3 = new Dutch();
      French g4 = new French();
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


abstract interface Language
{
	public abstract void greeting();
}

class English implements Language
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German implements Language
{
	public void greeting()
	{
		System.out.println("In German you say Guten Tag");
	}
}

class Dutch implements Language
{
	public void greeting()
	{
		System.out.println("In Dutch you say Goeden Dag");
	}
}

class French implements Language
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}