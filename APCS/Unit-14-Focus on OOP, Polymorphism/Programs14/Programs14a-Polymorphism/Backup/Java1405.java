// Java1405.java
// This program uses a <Language> interface
// with four implementing classes.


public class Java1405
{
	public static void main (String[] args)
	{
      English g1 = new English();
      German g2 = new German();
      Dutch g3 = new Dutch();
      French g4 = new French();
      g1.greeting();
      g2.greeting();
      g3.greeting();
      g4.greeting();
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