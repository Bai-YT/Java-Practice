// Java0905.java
// Card Case Study #05
// The <Card> class now has three methods to return
// the data values of <Card> class objects.
// Note that Java assigns initial values to object data.


public class Java0905
{
	public static void main(String[] args)
	{
		Card card = new Card();
      System.out.println("Suit:  " + card.suit());
      System.out.println("Rank:  " + card.rank());
      System.out.println("Value: " + card.pointValue());
	}
}


class Card
{
   private String suit;
   private String rank;
   private int pointValue;

   public String suit()
   {
      return suit;
   }

   public String rank()
   {
      return rank;
   }

   public int pointValue()
   {
      return pointValue;
   }
}

