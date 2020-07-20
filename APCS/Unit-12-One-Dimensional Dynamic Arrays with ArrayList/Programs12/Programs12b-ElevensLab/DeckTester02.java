// DeckTester02.java     12-26-14
// This program tests the <Deck02> class.
// This program tests the "dynamic array" Deck02 class. 
// ********************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered this "Elevens" AP Lab file to focus on 
// CS topics as the "Elevens" Lab is integrated into the curriculum.



public class DeckTester02
{
	public static void main(String[] args)
	{  
      Deck02 deck = new Deck02();
      deck.add("Clubs","Three",3);
      deck.add("Diamonds","Four",4);
      deck.add("Hearts","Five",5);
      deck.add("Spades","Six",6);
      deck.display();
      System.out.println(deck.getSize());
      System.out.println(deck.isEmpty());
	}
}

