// Deck02.java     12-26-14
// Methods <add> and <display> are added to the <Deck02> class.
// Objects of the <Card> class can now be stored in the <cards> array.
// This version is implemented with "dynamic arrays"
// ********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.


import java.util.ArrayList;

public class Deck02 
{
	private ArrayList<Card> cards;
	private int size;

	public Deck02() 
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
     
   public void display()
   {
      for (Card card: cards)
         System.out.println(card);
   }
   
}


