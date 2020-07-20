
import java.util.ArrayList;

public class Test1233
{
 	public static void main(String[] args)
 	{
		DeckB deck = new DeckB();
      System.out.println(deck);   
   }
}



class DeckB 
{
	private Card[] cards;
	private int size;

	public DeckB() 
   {
		cards = new Card[52];
		size = 52;
	}
    
}



