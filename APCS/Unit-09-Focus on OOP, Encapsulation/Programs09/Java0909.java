// Java0909.java
// Card Case Study #09
// A second, overloaded constructor, method is added to the program.
// It is now possible to specify Card object details during instantiation.


public class Java0909
{
	public static void main(String[] args)
	{
	   Card card = new Card("Diamonds","Queen",10);
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

   public Card(String s, String r, int pV)
   {
      suit = s;
      rank = r;
      pointValue = pV;
   }

   public String getSuit()    { return suit; }

   public String getRank()    { return rank; }

   public int getPointValue() { return pointValue; }
}

