// Java0906.java
// Card Case Study #06
// This program is identical to Java0905.java.
// The names of the return methods are changed.
// It is a common convention to call methods that
// return attribute values "get" methods.


public class Java0906
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

   public String getSuit()
   {
      return suit;
   }

   public String getRank()
   {
      return rank;
   }

   public int getPointValue()
   {
      return pointValue;
   }
}

