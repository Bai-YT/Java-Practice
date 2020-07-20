

import java.util.ArrayList;

public class Test1234
{
 	public static void main(String[] args)
 	{
		Deck03A decka = new Deck03A();
      System.out.println(decka); 
      Deck03B deckb = new Deck03B();
      System.out.println(deckb);    
   }
}


class Deck03A 
{
	private Card[] cards;
	private int size;

	public Deck03A() 
   {
		cards = new Card[52];
		size = 0;
	}
    
   public int getSize()
   {
      return size;
   }
   
   public boolean isEmpty()
   {
      return size == 0;
   }
   
   public void add(String suit, String rank, int value)
   {
      Card temp = new Card(suit,rank,value);
      cards[size] = temp;
      size++;
   }
   
   public void display()
   {
      System.out.println();
      for (int k = 0; k < size; k++)
         System.out.println(cards[k]);
      System.out.println();
   } 
   
   public String toString()
   {
      String temp = "";
      for (int k = 0; k < size; k++)
         temp = temp + cards[k].toString() + "\n";
      return temp;   
   }
 
}



class Deck03B 
{
	private ArrayList<Card> cards;
	private int size;

	public Deck03B() 
   {
		cards = new ArrayList<Card>();
		size = 0;
	}
    
   public int getSize()
   {
      return size;
   }
   
   public boolean isEmpty()
   {
      return size == 0;
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
