// Java0907.java
// Card Case Study #07
// The <Card> class adds three "set" methods  to
// alter the data attributes of <Card> objects.


public class Java0907
{
	public static void main(String[] args)
	{
		Card card = new Card();
      card.setSuit("Clubs");
      card.setRank("Seven");
      card.setPointValue(7);
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

   public String getSuit()             { return suit; }

   public String getRank()             { return rank; }

   public int getPointValue()          { return pointValue; }

   public void setSuit(String s)       { suit = s; }

   public void setRank(String r)       { rank = r; }

   public void setPointValue(int pV)   { pointValue = pV; }
}

