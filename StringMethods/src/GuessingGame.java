import java.util.*;
public class GuessingGame{
	
	public static void main(String atrg[]){
		HiddenWords Puzzle = new HiddenWords("HARPS");
		System.out.println(Puzzle.getHint("HRAMD"));
	}
}

