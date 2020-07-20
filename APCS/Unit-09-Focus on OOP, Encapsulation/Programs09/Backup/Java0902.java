                                                                                                                                   // Java0902.java
// Card Case Study #02
// Data fields, called attributes or instance variables,
// are added to the <Card> class.


public class Java0902
{
	public static void main(String[] args)
	{
   	Card card = new Card();
	}
}


class Card
{
   String suit;      // Clubs, Diamonds, Hearts, Spades
   String rank;      // Number, Jack, Queen, King, Ace
   int pointValue;   // Number, 10 for picture, 11 for Ace
}

