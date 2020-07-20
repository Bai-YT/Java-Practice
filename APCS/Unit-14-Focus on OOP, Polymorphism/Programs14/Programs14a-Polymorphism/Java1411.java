// Java1411.java
// This program shows a type of polymorphism that
// cannot be done with an interface umbrella.


public class Java1411
{
	public static void main (String[] args)
	{
      Actor belle = new Belle();
      Actor maurice = new Maurice();
      Actor gaston = new Gaston();
      Actor beast = new Beast();
      
      actDetails(belle);
      actDetails(maurice);
      actDetails(gaston);
      actDetails(beast);
	}
   
   public static void actDetails(Actor obj)
   {
     obj.act();
   }
}


class Actor
{
	public void act()
   {
      System.out.println("Every actor needs a costume.");
      System.out.println("Every actor also enters and exits the stage.");
   }
}

class Belle extends Actor
{
	public void act()
	{
      super.act();
		System.out.println("Belle is spirited and head strong.");
      System.out.println("Belle likes to read books.");
      System.out.println("She does not like Gaston.");
      System.out.println("She learns to like Beast.");
      System.out.println();
	}
}

class Maurice extends Actor
{
	public void act()
	{
      super.act();
		System.out.println("Maurice is Belle's father.");
      System.out.println("He is also a scientist.");
      System.out.println();
	}
}

class Gaston extends Actor
{
	public void act()
	{
      super.act();
		System.out.println("Gaston likes to show off his muscles.");
      System.out.println("He wants to marry Belle.");
      System.out.println("He tries to kill Beast.");
      System.out.println();
	}
}
class Beast extends Actor
{
	public void act()
	{
      super.act();
		System.out.println("Beast lives alone in a castle.");
      System.out.println("He keeps Belle at the castle and dances with her.");
      System.out.println("Beast falls in love with Belle.");
      System.out.println();
	}
}


