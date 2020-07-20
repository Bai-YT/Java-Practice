public class Test0905
{
	public static void main(String args[])
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
   String suit;      
   String rank;      
   int pointValue;  
}

