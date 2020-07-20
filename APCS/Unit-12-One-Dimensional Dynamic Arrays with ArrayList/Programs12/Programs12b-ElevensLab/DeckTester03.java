// DeckTester03.java     12-26-14
// This program tests the Deck03 class.
// This program tests the "dynamic array" Deck03 class. 
// ********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.



public class DeckTester03
{
	public static void main(String[] args)
	{  
      Deck03 deck = new Deck03();
      deck.add("Clubs","Three",3);
      deck.add("Diamonds","Four",4);
      deck.add("Hearts","Five",5);
      deck.add("Spades","Six",6);
      System.out.println(deck);
      System.out.println(deck.getSize());
      System.out.println(deck.isEmpty());
	}
}

