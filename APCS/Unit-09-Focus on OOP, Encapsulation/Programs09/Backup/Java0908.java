// Java0908.java
// Card Case Study #08
// This <Card> class uses a constructor to initialize variables
// during the instantiation of a new <Card> object.
// This is an example of increasing reliability by an automatic constructor call.


public class Java0908
{
	public static void main(String[] args)
	{
		Card card = new Card();
      System.out.println("Suit:  " + card.getSuit());
      System.out.println("Rank:  " + card.getRank());
      System.out.println("Value: " + card.getPointValue());
	}
}


class Card
{
   private String suit;
   private String rank;
   private int pointValue;

   public Card()
   {
      suit = "Clubs";
      rank = "Two";
      pointValue = 2;
   }

   public String getSuit()    { return suit; }

   public String getRank()    { return rank; }

   public int getPointValue() { return pointValue; }
}

