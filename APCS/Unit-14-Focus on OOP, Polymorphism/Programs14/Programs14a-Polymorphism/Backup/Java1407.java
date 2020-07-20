// Java1407.java
// This program uses polymorphism with a very
// simple <printGreeting> method.
// The <Language> interface is the "umbrella".


public class Java1407
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