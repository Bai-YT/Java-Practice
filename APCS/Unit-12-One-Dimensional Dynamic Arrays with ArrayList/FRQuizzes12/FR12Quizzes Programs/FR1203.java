
import java.util.ArrayList;

public class FR1203
{
   public static void main(String[] args)
   {
      Deck deck = new Deck();
      deck.add("Clubs","Three",3);
      deck.add("Diamonds","Four",4);
      deck.add("Hearts","Five",5);
      deck.add("Spades","Six",6);
      System.out.println(deck);
   }
}


class Card
{
   private String suit;
   private String rank;
   private int value;

   public Card(String s, String r, int v)
   {
      suit = s;
      rank = r;
      value = v;
   }
  
   public String toString()
   {
      return "[" + suit + ", " + rank + ", " + value + "]";
   }
}


class Deck 
{
	private ArrayList<Card> cards;
	private int size;

	public Deck() 
   {
		cards = new ArrayList<Card>();
		size = 0;
	}
      
   public void add(String suit, String rank, int value)
   {
      Card temp = new Card(suit,rank,value);
      cards.add(temp);
      size++;
   }
    
   public String toString()			
	{
 		String temp = "";
 		for (Card card : cards)
 			temp = temp + card.toString() + "\n";
		return temp;   
 	}
   
}
