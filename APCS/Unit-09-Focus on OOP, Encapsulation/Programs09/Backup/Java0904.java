// Java0904.java
// Card Case Study #04
// All the variables in the <Card> class are now declared as private access.
// This prevents improper, public access to the data variables.


public class Java0904
{
	public static void main(String[] args)
	{
		Card card = new Card();
      card.suit = "Hearts";
      card.rank = "King";
      card.pointValue = 10;
      System.out.println("Suit:  " + card.suit);
      System.out.println("Rank:  " + card.rank);
      System.out.println("Value: " + card.pointValue);
	}
}


class Card
{
   private String suit;      // Clubs, Diamonds, Hearts, Spades
   private String rank;      // Number, Jack, Queen, King, Ace
   private int pointValue;   // Number, 10 for picture, 11 for Ace
}

