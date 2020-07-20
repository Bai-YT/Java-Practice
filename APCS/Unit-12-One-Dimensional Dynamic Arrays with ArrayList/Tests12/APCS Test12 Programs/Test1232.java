
import java.util.ArrayList;

public class Test1232
{
 	public static void main(String[] args)
 	{
		DeckA deck = new DeckA();
      System.out.println(deck);   
   }
}



class DeckA 
{
	private ArrayList<Card> cards;
	private int size;

	public DeckA() 
   {
		cards = new ArrayList<Card>();
		size = 0;
	}   
}



