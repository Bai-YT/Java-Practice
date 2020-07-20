

import java.util.ArrayList;

public class Test1240
{
	public static void main(String args[])
	{   
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck 
{
	private ArrayList<Card> cards;
   private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
   private String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine",
                             "Ten","Jack","Queen","King","Ace"};
   private int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
   
	private int size;

	public Deck() 
   {
      size = 52;
		cards = new ArrayList<Card>();
      int count = 0;
      for (int suitIndex = 0; suitIndex < 4; suitIndex++)
      {
         for (int rankIndex = 0; rankIndex < 13; rankIndex++)
         {
            Card temp = new Card(suits[suitIndex],ranks[rankIndex],values[rankIndex]);
            cards.add(temp);
         }
      }
      shuffle();
	}
      
   public String toString()
   {
      String temp = "";
      for (Card card : cards)
         temp = temp + card.toString() + "\n";
      return temp;   
   }
   
   private void shuffle()
   {  
      for (int k = 1; k < 1000; k++)
      {
         int random1 = (int) (Math.random() * 52);
         int random2 = (int) (Math.random() * 52);
         Card temp = cards.get(random1);
         cards.set(random1,cards.get(random2));
         cards.set(random2,temp);
      }
   }
  
}


   
   
