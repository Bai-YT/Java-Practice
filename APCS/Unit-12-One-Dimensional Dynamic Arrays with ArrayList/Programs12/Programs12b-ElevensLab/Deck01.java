// Deck01.java     12-26-14
// This is the first stage of the Deck class, as introduced
// in the previous "Static Arrays" chapter.
// This version is implemented with "dynamic arrays".
// ********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.

import java.util.ArrayList;

public class Deck01 
{
	private ArrayList<Card> cards;
	private int size;

	public Deck01() 
   {
		cards = new ArrayList<Card>();;
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
}
