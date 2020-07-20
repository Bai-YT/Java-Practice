// Lab12bv100.java     This is the 100-point solution. 
// This version is implemented with "Dynamic Arrays"
// This version includes:
//    A constructor that assigns all 52 cards to the <cards> array.
//    A <toString> method that displays all 52 cards.
//    A <shuffle> method that randomizes the <cards> array with swapping.
//    A <shuffle> method that randomizes the <cards> array with insertion.
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.


import java.util.ArrayList;

public class Lab12bv100
{
	public static void main(String[] args)
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
   
   // This method is required for the 90-point and 100-point versions.
   /*
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
   */
   
   // This method is required for the 100-point versions.
   
   private void shuffle()
   {
      ArrayList<Card> temp = new ArrayList<Card>();
      for (int k = 0; k < size; k++)
         temp.add(null);
      for (int k = 0; k < size; k++)
      {
         boolean notUsed = true;
         while (notUsed)
         {
            int rnd = (int) (Math.random() * size);
            if (temp.get(rnd) == null)
            {
               temp.set(rnd,cards.get(k));
               notUsed = false;
            }
         }
      }
      for (int k = 0; k < size; k++)
      {
         cards.set(k,temp.get(k));
      } 
   }


}


   
   
