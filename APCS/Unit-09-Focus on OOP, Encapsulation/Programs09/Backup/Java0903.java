// Java0903.java
// Card Case Study #03
// <Card> attributes are accessed directly by the <main> method.
// This program violates encapsulation, even though it compiles, and executes.
// This approach greatly compromises program reliability.


public class Java0903
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
   String suit;      // Clubs, Diamonds, Hearts, Spades
   String rank;      // Number, Jack, Queen, King, Ace
   int pointValue;   // Number, 10 for picture, 11 for Ace
}

